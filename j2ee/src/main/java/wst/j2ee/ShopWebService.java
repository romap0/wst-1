package wst.j2ee;


import wst.dao.ShopDAO;
import wst.entity.Shop;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



@WebService(serviceName = "ShopService")
public class ShopWebService {
    @Resource(lookup = "jdbc/postgres")
    private DataSource dataSource;

    @Inject
    private ShopDAO shopDAO;

    @WebMethod(operationName = "findAll")
    public List<Shop> findAll() {
        try {
            shopDAO = new ShopDAO(getConnection());
            return shopDAO.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @WebMethod(operationName = "filter")
    public List<Shop> filter(
        @WebParam(name = "name") String name,
        @WebParam(name = "city") String city,
        @WebParam(name = "address") String address,
        @WebParam(name = "isActive") Boolean isActive,
        @WebParam(name = "type") String type
        ) {
        try {
            shopDAO = new ShopDAO(getConnection());
            return shopDAO.filter(name, city, address, isActive, type);
        } catch (SQLException e) {
            Logger.getLogger(ShopWebService.class.getName()).log(Level.SEVERE, null, e);
        }

        return  null;
    }

    private Connection getConnection() {
        Connection result = null;

        try {
            result = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ShopWebService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }
}
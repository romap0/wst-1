package wst.standalone;

import wst.dao.SimplePostgresSQLDAO;
import wst.dao.ShopDAO;
import wst.entity.Shop;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.sql.SQLException;
import java.util.List;

@WebService(serviceName = "ShopService", targetNamespace = "http://wst.com")
public class ShopWebService {
    @Inject
    private ShopDAO shopDAO;

    @WebMethod(operationName = "getShops")
    public List<Shop> getShops() {
        SimplePostgresSQLDAO dao = new SimplePostgresSQLDAO();
        List<Shop> shops = dao.getAllShops();

        return shops;
    }

    @WebMethod(operationName = "findAll")
    public List<Shop> findAll() {
        try {
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
        
        System.out.println("name: " + name + " city: " + city + " address: " + address + " isActive: " + isActive + " type: " + type);

        try {
            return shopDAO.filter(name, city, address, isActive, type);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  null;
    }

    public ShopWebService(ShopDAO ShopDAO) {
        this.shopDAO = ShopDAO;
    }

    public ShopWebService() {
        this.shopDAO = new ShopDAO();
    }
}

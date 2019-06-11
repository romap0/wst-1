package wst.dao;

import wst.entity.Shop;
import wst.query.BuildQuery;
import wst.query.Query;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class ShopDAO {
    private final String TABLE_NAME = "shops";
    private final String NAME_COLUMN = "name";
    private final String IS_ACTIVE_COLUMN = "is_active";
    private final String TYPE_COLUMN = "type";
    private final String ADDRESS_COLUMN = "address";
    private final String CITY_COLUMN = "city";

    private final Connection connection;

    public ShopDAO(Connection connection) {
        this.connection = connection;
    }

    public ShopDAO() {
        this.connection = ConnectionUtil.getConnection();
    }

    public List<Shop> findAll() throws SQLException {
        try {
            Statement statement = connection.createStatement();
            statement.execute("SELECT * FROM shops");
            List<Shop> result = rsToEntities(statement.getResultSet());
            System.out.println(result);
            return result;

        } catch (SQLException ex) {
            Logger.getLogger(SimplePostgresSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Shop> filter(String name, String city, String address, Boolean isActive, String type) throws SQLException {
        Logger.getLogger(SimplePostgresSQLDAO.class.getName()).log(Level.SEVERE, name+city+address+type);

        if (Stream.of(name, address, isActive, city, type).allMatch(Objects::isNull)) {
            return findAll();
        }

        BuildQuery buildQuery = new BuildQuery()
            .tableName(TABLE_NAME)
            .selectColumns(NAME_COLUMN, ADDRESS_COLUMN, IS_ACTIVE_COLUMN, TYPE_COLUMN, CITY_COLUMN);

        if(name != null){
            buildQuery = buildQuery.condition(new Condition(NAME_COLUMN, name, String.class));
        }

        if(address != null){
            buildQuery = buildQuery.condition(new Condition(ADDRESS_COLUMN, address, String.class));
        }

        if(name != null){
            buildQuery = buildQuery.condition(new Condition(IS_ACTIVE_COLUMN, isActive, Boolean.class));
        }

        if(name != null){
            buildQuery = buildQuery.condition(new Condition(TYPE_COLUMN, type, String.class));
        }

        if(name != null){
            buildQuery = buildQuery.condition(new Condition(CITY_COLUMN, city, String.class));
        }

        Query query = buildQuery.buildPreparedStatementQuery();
        try {
            PreparedStatement ps = connection.prepareStatement(query.getQueryString());
            query.initPreparedStatement(ps);
            ResultSet rs = ps.executeQuery();
            return rsToEntities(rs);
        } catch (SQLException ex) {
            Logger.getLogger(SimplePostgresSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private List<Shop> rsToEntities(ResultSet rs) throws SQLException {
        List<Shop> result = new ArrayList<>();

        while (rs.next()) {
            result.add(resultSetToEntity(rs));
        }

        return result;
    }

    private Shop resultSetToEntity(ResultSet rs) throws SQLException {
        String name = rs.getString("name");
        String address = rs.getString("address");
        String type = rs.getString("type");
        String city = rs.getString("city");
        Boolean isActive = rs.getBoolean("is_active");

        return new Shop(name, address, isActive, type, city);
    }
}
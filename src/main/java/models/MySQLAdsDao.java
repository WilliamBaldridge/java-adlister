package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;
import models.Ad;
import models.Ads;
import models.Config;

public class MySQLAdsDao implements Ads {

    private Connection connection = null;


    public MySQLAdsDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());

            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("DB connection error", e);
        }

    }

    @Override
    public List<Ad> all() {

        List<Ad> ads = new ArrayList<>();
        String query = "SELECT * FROM ads";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next())
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad adToBeSaved) {

        long newId = 0L;
        String insertQuery = "INSERT INTO ads (user_id, title, description) VALUES ('" + adToBeSaved.getUserId() + "', '" + adToBeSaved.getTitle() + "', '" + adToBeSaved.getDescription() + "')";

        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                newId = rs.getLong(1);
                System.out.printf("New insert ID = %s", newId);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return newId;
    }
}

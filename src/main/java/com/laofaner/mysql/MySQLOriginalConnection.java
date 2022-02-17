package com.laofaner.mysql;

import com.laofaner.mysql.entity.Actor;

import java.sql.*;

public class MySQLOriginalConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/sakila";
            String userName = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, userName, password);
            statement = conn.prepareStatement("select * from actor");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
//                int row = resultSet.getRow();
//                System.out.println(row);
                int actorId = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                Date lastUpdate = resultSet.getDate(4);
                Actor actor = new Actor()
                        .setActorId(actorId)
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setLastUpdate(lastUpdate);
                System.out.println(actor);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert resultSet != null;
                resultSet.close();
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

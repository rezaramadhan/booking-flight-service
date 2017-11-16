package id.booking.flight.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void readDatabase(String tableName, String query) throws Exception {
    		try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/" + tableName
                    		+ "?user=root&password=");
            statement = connect.createStatement();
            resultSet = statement
                    .executeQuery(query);
//            writeResultSet(resultSet);
            System.out.println("Query executed successfully.");
        } catch (Exception e) {
        		System.out.println("Query execute failed.");
            throw e;
        } finally {
            close();
        }
    }
    
//    public void readDataBase() throws Exception {
//        try {
//            // This will load the MySQL driver, each DB has its own driver
//            Class.forName("com.mysql.jdbc.Driver");
//            // Setup the connection with the DB
//            connect = DriverManager
//                    .getConnection("jdbc:mysql://localhost/booking_domain?"
//                            + "user=root&password=");
//
//            // Statements allow to issue SQL queries to the database
//            statement = connect.createStatement();
//            // Result set get the result of the SQL query
//            resultSet = statement
//                    .executeQuery("select * from booking_domain.users");
//            writeResultSet(resultSet);
//            
//            // PreparedStatements can use variables and are more efficient
//            preparedStatement = connect
//                    .prepareStatement("insert into booking_domain.users values (default, ?, ?, ?, ?, ?)");
//            preparedStatement.setString(1, "atikafrds");
//            preparedStatement.setString(2, "Atika Firdaus");
//            preparedStatement.setString(3, "123456");
//            preparedStatement.setString(4, "abcdef");
//            preparedStatement.setDate(5, new Date(2017, 11, 16));
//            preparedStatement.executeUpdate();
//
//            preparedStatement = connect
//                    .prepareStatement("SELECT * from booking_domain.users");
//            resultSet = preparedStatement.executeQuery();
//            writeResultSet(resultSet);
//
////            preparedStatement = connect
////            .prepareStatement("delete from feedback.comments where myuser= ? ; ");
////            preparedStatement.setString(1, "Test");
////            preparedStatement.executeUpdate();
//
//            resultSet = statement
//            .executeQuery("select * from booking_domain.users");
//            writeMetaData(resultSet);
//
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            close();
//        }
//
//    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        System.out.println("The columns in the table are: ");
        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " + i + ": "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            int id = resultSet.getInt("Id");
            String username = resultSet.getString("Username");
            String name = resultSet.getString("Name");
            String password = resultSet.getString("Password");
            System.out.println("Id" + id);
            System.out.println("Username: " + username);
            System.out.println("Name: " + name);
            System.out.println("Password: " + password);
        }
    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}
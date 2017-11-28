package id.booking.flight.helper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void runQuery(String dbName, String query) throws Exception {
    		try {
            Class.forName("com.mysql.jdbc.Driver");
            String connString = "jdbc:mysql://localhost/" + dbName;
            connect = DriverManager.getConnection(connString, "root", "password");
            statement = connect.createStatement();
            
          // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
              .prepareStatement(query);
//          preparedStatement.setString(1, "atikafrds");
//          preparedStatement.setString(2, "Atika Firdaus");
//          preparedStatement.setString(3, "123456");
//          preparedStatement.setString(4, "abcdef");
//          preparedStatement.setDate(5, new Date(2017, 11, 16));
          preparedStatement.executeUpdate();
            
//            resultSet = statement.executeQuery(query);
//            System.out.println(resultSet);
            System.out.println("Query executed successfully.");
        } catch (Exception e) {
        		System.out.println("Query execute failed.");
            throw e;
        } finally {
            close();
        }
    }
    
    public ArrayList<Map<String, String>> runSelectQuery(String dbName, String query) throws Exception {
    		ArrayList<Map<String, String>> results = new ArrayList<Map<String, String>>();

    		try {
	        Class.forName("com.mysql.jdbc.Driver");
	        String connString = "jdbc:mysql://localhost/" + dbName;
            connect = DriverManager.getConnection(connString, "root", "password");
	        statement = connect.createStatement();
	        resultSet = statement.executeQuery(query);
	        while (resultSet.next()) {
	        		ResultSetMetaData meta = resultSet.getMetaData();
	        		Map<String, String> resultMap = new HashMap<String, String>();
	        		
	        		for (int i = 1; i <= meta.getColumnCount(); i++) {                			
	        			resultMap.put(meta.getColumnLabel(i), resultSet.getString(i));
	        		}
	        		
	        		results.add(resultMap);
	        }
	        System.out.println("Query executed successfully.");
        } catch (Exception e) {
        		System.out.println("Query execute failed.");
            throw e;
        } finally {
            close();
        }
    		
    		return results;
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
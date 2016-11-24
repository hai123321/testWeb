/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luyenchu
 */
public class DbContext {

    static final String IP = "localhost";
    static final String url = "jdbc:sqlserver://" + IP + ":1433;databaseName=PRJ321_Lab5";
    static final String user = "sa";
    static final String passwd = "123456";

    private Connection conn = null;
    private Statement st = null;

    public int executeUpdate(String sql) throws Exception {
        openConnection();
        try {
            return st.executeUpdate(sql);
        } finally {
            close();
        }
    }

    public ResultSet executeQuery(String sql) throws Exception {
        openConnection();
        return st.executeQuery(sql);

    }
    
    public PreparedStatement executeQueryPre(String query) throws Exception{
        try {
            openConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            return preparedStatement;
        } catch (SQLException ex) {
            return null;
        }
    }

    public void close() {
        if (st != null) {
            try {
                st.close();
            } catch (Exception ignore) {
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception ignore) {
            }
        }
    }

    private void openConnection() throws Exception {
        if (conn == null) {
            ///
            //1. Load class
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2. Get connection by url (connection string)
            conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("connection: " + conn);
            st = conn.createStatement();
        }
    }
    
    
}

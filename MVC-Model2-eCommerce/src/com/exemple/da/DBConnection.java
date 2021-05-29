package com.exemple.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private  static Connection connection;
    public  static  Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection==null){
            //1. loading drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");

        }
        return  connection;
    }
    public  static  void  main(String[] args) throws SQLException,ClassNotFoundException{
        if (getConnection()!=null){
            System.out.println("okila");
        }
    }
}

package com.exemple.model;

import java.sql.*;

public class LoginDA {
    private   String username,password;
    public LoginDA(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private  static final  String tblName= "account";
    //1. tao 1 connection
    private static Connection conn = null;
    private  static Statement stmt = null;
    private static PreparedStatement pstm = null;

    public  static  void  createConnection() throws ClassNotFoundException,SQLException{
        //step1 dang ky driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //step 2
        conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root","");

    }
    public static  boolean checkLoginStatement (String user, String pass) throws  SQLException{
        String dbQuery = "SELECT username FROM users WHERE username= '" +user+"'AND password= '"+pass+"'  ";
        stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery(dbQuery);
        while (resultSet.next()){
            System.out.println("Username is : " + resultSet.getString("username"));
            return  true;
        }
        return false;
    }
//    public  static  boolean checkLoginPreparedStatement(String use , String pas) throws SQLException{
//        String dbQuery = "SELECT username FROM users WHERE username like ? AND password like ? ";
//        pstm =conn.prepareStatement(dbQuery);
//        pstm.setString(1,use);
//        pstm.setNString(2,pas);
//        ResultSet resultSet =pstm.executeQuery();
//        while (resultSet.next()){
//            System.out.println("Your Username is :" +resultSet.getString("username "));
//            return true;
//        }return false;
//
//    }

//    public static void main(String[] args)throws SQLException,ClassNotFoundException {
//        createConnection();
//        boolean status = checkLoginStatement("admin","admin");
//        if (status){
//            System.out.println("login success");
//        }else {
//            System.out.println("fail");
//        }
//    }
}

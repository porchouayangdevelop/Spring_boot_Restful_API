package com.restfullapi.jwt.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class dbConfig {

    public Connection cn;
    public ResultSet rs;
    public PreparedStatement ps;
    public String url = "jdbc:mysql://localhost:3306/jwt_security?useSSL=false&serverTimezone=UTC";
    public String username = "root";
    public String password = "";
    public String driver = "com.mysql.cj.jdbc.Driver";

}

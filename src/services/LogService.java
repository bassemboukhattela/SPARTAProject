/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.ILogService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.MyDB;

/**
 *
 * @author Bassem
 */
public class LogService implements ILogService {

    Connection maConnexion;

    public LogService() {
        maConnexion = MyDB.getInstance().getCnx();
    }

    @Override
    public int log(String username, String password) throws SQLException {
       if(maConnexion== null)return -1;
       String sql ="select * FROM client where username=? and password=?";
       try {
           PreparedStatement prest =maConnexion.prepareStatement(sql);
           prest.setString(1,username );
           prest.setString(2, password);
           ResultSet rs = prest.executeQuery();
           while(rs.next()){
             return 0;
               
           }
           String sqladm ="select * FROM admin where username_adm=? and password_adm=?";
       
           PreparedStatement prestadm =maConnexion.prepareStatement(sqladm);
           prestadm.setString(1,username );
           prestadm.setString(2, password);
           ResultSet rsadm = prestadm.executeQuery();
           while(rsadm.next()){
             return 1;
               
           }
           String sqlorg ="select * FROM organisateur where username_org=? and password_org=?";
       
           PreparedStatement prestorg =maConnexion.prepareStatement(sqlorg);
           prestorg.setString(1,username );
           prestorg.setString(2, password);
           ResultSet rsorg = prestorg.executeQuery();
           while(rsorg.next()){
             return 2;
               
           }
           }catch(SQLException se){
               
               se.printStackTrace();
           }
       return 10;
}}
        

        

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import interfaces.IUserService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.MyDB;

/**
 *
 * @author Bassem
 */
public class UserService implements IUserService {

    Connection maConnexion;

    public UserService() {
        maConnexion = MyDB.getInstance().getCnx();
    }

    @Override
    public void addUser(User u) throws SQLException {

        PreparedStatement pst = maConnexion.prepareStatement("INSERT INTO `client`(`id_user`, `nom`, `prenom`, `tel`, `cin`, `mail`, `username`, `password`, `universite`, `num_carte_etud`) VALUES (NULL,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, u.getNom());
        pst.setString(2, u.getPrenom());
        pst.setInt(3, u.getTel());
        pst.setInt(4, u.getCin());
        pst.setString(5, u.getMail());
        pst.setString(6, u.getUsername());
        pst.setString(7, u.getPassword());
        pst.setString(8, u.getUniversite());
        pst.setInt(9, u.getNum_carte_etudiant());
        System.out.println(pst);
        pst.executeUpdate();
    }

    @Override
    public void updateUser(User u) throws SQLException {

        String req = "UPDATE `client` SET `nom`=?,`prenom`=?,`tel`=?,`cin`=?,`mail`=?,`username`=?,`password`=?,`universite`=?,`num_carte_etud`=? WHERE id_user=?";

        PreparedStatement pst = maConnexion.prepareStatement(req);
        pst.setString(1, u.getNom());
        pst.setString(2, u.getPrenom());
        pst.setInt(3, u.getTel());
        pst.setInt(4, u.getCin());
        pst.setString(5, u.getMail());
        pst.setString(6, u.getUsername());
        pst.setString(7, u.getPassword());
        pst.setString(8, u.getUniversite());
        pst.setInt(9, u.getNum_carte_etudiant());
        pst.setInt(10, u.getId());
        System.out.println(pst);
        pst.executeUpdate();

    }

    @Override
    public void deleteUser(User u) throws SQLException {
        PreparedStatement pst = maConnexion.prepareStatement(" DELETE FROM `client` WHERE `nom` = ? ");
        pst.setString(1, u.getNom());
        System.out.println(pst);
        pst.executeUpdate();
    }

    @Override
    public ArrayList<User> getAllUsers() throws SQLException {
        ArrayList<User> listeTable = new ArrayList();

        PreparedStatement pst = maConnexion.prepareStatement("select * from client ");
        System.out.println(pst);
        ResultSet rst = pst.executeQuery();
        
        User u = null;

        while (rst.next()) {
            int id = rst.getInt(1);
            String nom = rst.getString(2);
            String prenom = rst.getString(3);
            int tel = rst.getInt(4);
            int cin = rst.getInt(5);
            String mail = rst.getString(6);
            String username = rst.getString(7);
            String password = rst.getString(8);
            String universite = rst.getString(9);
            int num_etud = rst.getInt(10);
         
u = new User(id, nom, prenom, tel, cin, mail, username, password, universite, num_etud);
            listeTable.add(u);

        }
        return listeTable;
    }

    @Override
    public User findUserById(int id) throws SQLException {
        PreparedStatement pst = maConnexion.prepareStatement("select * from client where id_user="+id);

        System.out.println(pst);
        ResultSet rst = pst.executeQuery();
        User u = null;
        while (rst.next()) {
            u = new User();
            int id1 = rst.getInt(1);
            String nom = rst.getString(2);
            String prenom = rst.getString(3);
            int tel = rst.getInt(4);
            int cin = rst.getInt(5);
            String mail = rst.getString(6);
            String username = rst.getString(7);
            String password = rst.getString(8);
            String universite = rst.getString(9);
            int num_etud = rst.getInt(10);
            

            System.out.println(id1 + " " + nom + " " + prenom + " " + tel + " " + cin + " "+ mail + " " + username + " " + password + " " + universite + " " + num_etud);

        }

        return u;

    }

}

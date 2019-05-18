/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Admin;
import interfaces.IAdminService;
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
public class AdminService implements IAdminService {

    Connection maConnexion;

    public AdminService() {
        maConnexion = MyDB.getInstance().getCnx();
    }

    @Override
    public void addAdmin(Admin adm) throws SQLException {
        PreparedStatement pst = maConnexion.prepareStatement("INSERT INTO `admin`(`id_adm`, `nom_adm`, `prenom_adm`, `matricule`, `poste`, `username_adm`, `password_adm`) VALUES(NULL,?,?,?,?,?,?)");
        pst.setString(1, adm.getNom_adm());
        pst.setString(2, adm.getPrenom_adm());
        pst.setInt(3, adm.getMatricule_adm());
        pst.setString(4, adm.getPoste_adm());
        pst.setString(5, adm.getUsername_adm());
        pst.setString(6, adm.getPassword_adm());
        System.out.println(pst);
        pst.executeUpdate();

    }

    @Override
    public void updateAdmin(Admin adm) throws SQLException {
        String req = "UPDATE `admin` SET `nom_adm` = ?,`prenom_adm`=?,`matricule`=?,`poste`=?, `username_adm`=?, `password_adm`=? WHERE `id_adm`=?";
        PreparedStatement pst = maConnexion.prepareStatement(req);

        pst.setString(1, adm.getNom_adm());
        pst.setString(2, adm.getPrenom_adm());
        pst.setInt(3, adm.getMatricule_adm());
        pst.setString(4, adm.getPoste_adm());
        pst.setString(5, adm.getUsername_adm());
        pst.setString(6, adm.getPassword_adm());
        pst.setInt(7, adm.getId_adm());
        System.out.println(pst);
        pst.executeUpdate();

    }

    @Override
    public void deleteAdmin(Admin adm) throws SQLException {
        PreparedStatement pst = maConnexion.prepareStatement(" DELETE FROM `admin` WHERE `matricule` = ? ");
        pst.setInt(1, adm.getMatricule_adm());
        System.out.println(pst);
        pst.executeUpdate();
    }

    @Override
    public ArrayList<Admin> getAllAdmin() throws SQLException {
        PreparedStatement pst = maConnexion.prepareStatement("select * from admin ");
        System.out.println(pst);
        ResultSet rst = pst.executeQuery();
        ArrayList<Admin> listeTableadm = new ArrayList();
        Admin adm = null;
        while (rst.next()) {
            int id = rst.getInt(1);
            String nom_adm = rst.getString(2);
            String prenom_adm = rst.getString(3);
            int matricule = rst.getInt(4);
            String poste = rst.getString(5);
            String username_adm = rst.getString(6);
            String password_adm = rst.getString(7);
            
            adm = new Admin(id, nom_adm, prenom_adm, matricule, poste, username_adm, password_adm);
            listeTableadm.add(adm);
        }
        return listeTableadm;
    }

    @Override
    public Admin findAdminById(int id) throws SQLException {

        PreparedStatement pst = maConnexion.prepareStatement("select * from admin where id_adm=" + id);

        System.out.println(pst);
        ResultSet rst = pst.executeQuery();
        Admin adm = null;
        while (rst.next()) {
            adm = new Admin();
            int ida = rst.getInt(1);
            String nom_adm = rst.getString(2);
            String prenom_adm = rst.getString(3);
            int matricule = rst.getInt(4);
            String poste = rst.getString(5);
            String username_adm = rst.getString(6);
            String password_adm = rst.getString(7);
            System.out.println(ida + " " + nom_adm + " " + prenom_adm + " " + matricule + " " + poste+ " " + username_adm + " " +password_adm);
        }
        return adm;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Organisateur;
import interfaces.IOrganisateurService;
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
public class OrganisateurService implements IOrganisateurService {

    Connection maConnexion;

    public OrganisateurService() {
        maConnexion = MyDB.getInstance().getCnx();
    }

    @Override
    public void addOrganisateur(Organisateur org) throws SQLException {

        PreparedStatement pst = maConnexion.prepareStatement("INSERT INTO `organisateur`(`id_org`, `nom_org`, `prenom_org`, `tel_org`, `cin_org`, `mail_org`, `username_org`, `password_org`, `raison_social`, `secteur_activite`, `num_carte_pro`, `site_web`) VALUES (NULL, ?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, org.getNom_org());
        pst.setString(2, org.getPrenom_org());
        pst.setInt(3, org.getTel_org());
        pst.setInt(4, org.getCin_org());
        pst.setString(5, org.getMail_org());
        pst.setString(6, org.getUsername_org());
        pst.setString(7, org.getPassword_org());
        pst.setString(8, org.getRaison_social_org());
        pst.setString(9, org.getSecteur_activite_org());
        pst.setInt(10, org.getNum_carte_pro());
        pst.setString(11, org.getSite_web());
        System.out.println(pst);
        pst.executeUpdate();
    }

    @Override
    public void updateOrganisateur(Organisateur org) throws SQLException {
        String req = "UPDATE `organisateur` SET `nom_org`=?,`prenom_org`=?,`tel_org`=?,`cin_org`=?,`mail_org`=?,`username_org`=?,`password_org`=?,`raison_social`=?,`secteur_activite`=?,`num_carte_pro`=?,`site_web`=? WHERE `id_org`=?";
        PreparedStatement pst = maConnexion.prepareStatement(req);
        pst.setString(1, org.getNom_org());
        pst.setString(2, org.getPrenom_org());
        pst.setInt(3, org.getTel_org());
        pst.setInt(4, org.getCin_org());
        pst.setString(5, org.getMail_org());
        pst.setString(6, org.getUsername_org());
        pst.setString(7, org.getPassword_org());
        pst.setString(8, org.getRaison_social_org());
        pst.setString(9, org.getSecteur_activite_org());
        pst.setInt(10, org.getNum_carte_pro());
        pst.setString(11, org.getSite_web());
        pst.setInt(12,org.getId_org());
        System.out.println(pst);
        pst.executeUpdate();
    
    }

    @Override
    public void deleteOrganisateur(Organisateur org) throws SQLException {
        PreparedStatement pst = maConnexion.prepareStatement(" DELETE FROM `organisateur` WHERE `cin_org` = ? ");
        pst.setInt(1, org.getCin_org());
        System.out.println(pst);
        pst.executeUpdate();
    }

    @Override
    public ArrayList<Organisateur> getAllOrganisateurs() throws SQLException {
         PreparedStatement pst = maConnexion.prepareStatement("select * from organisateur ");
        System.out.println(pst);
        ResultSet rst = pst.executeQuery();
        ArrayList<Organisateur> listeTableorg = new ArrayList();
        Organisateur org =null;
        while (rst.next()) {
            int id = rst.getInt(1);
            String nom_org = rst.getString(2);
            String prenom_org = rst.getString(3);
             int tel_org = rst.getInt(4);
             int cin_org = rst.getInt(5);
            String mail_org = rst.getString(6);
            String username_org = rst.getString(7);
            String password_org = rst.getString(8);
            String raison_social = rst.getString(9);
            String secteur_activite = rst.getString(10);
             int  num_carte_pro = rst.getInt(11);
            String site_web = rst.getString(12);
            org = new Organisateur(id, nom_org, prenom_org, tel_org, cin_org, mail_org, username_org, password_org, raison_social, secteur_activite,num_carte_pro, site_web);
            listeTableorg.add(org);
        }
        return listeTableorg;
    }

    @Override
    public Organisateur findOrganisateurById(int id) throws SQLException {
        
        PreparedStatement pst = maConnexion.prepareStatement("select * from organisateur where id_org=" + id);

        System.out.println(pst);
        ResultSet rst = pst.executeQuery();
        Organisateur org = null;
        while (rst.next()) {
            org = new Organisateur();
            int ido =rst.getInt(1);
            String nom_org = rst.getString(2);
            String prenom_org = rst.getString(3);
             int  tel_org = rst.getInt(4);
             int  cin_org = rst.getInt(5);
            String mail_org = rst.getString(6);
            String username_org = rst.getString(7);
            String password_org = rst.getString(8);
            String raison_social = rst.getString(9);
            String secteur_activite = rst.getString(10);
             int num_carte_pro = rst.getInt(11);
            String site_web = rst.getString(12);
           
            
            System.out.println(ido + " " + nom_org + " " + prenom_org + " " + tel_org + " "+ cin_org + " " + mail_org+ " " + username_org+ " " + password_org+ " " + raison_social + " " + secteur_activite+ " " + num_carte_pro +" " + site_web );

        }

        return org;
    }

}

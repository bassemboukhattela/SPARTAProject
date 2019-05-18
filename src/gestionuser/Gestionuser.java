/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUser;

import entities.Admin;
import entities.Organisateur;
import entities.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.AdminService;
import services.LogService;
import services.OrganisateurService;
import services.UserService;

/**
 *
 * @author Bassem
 */
public class Gestionuser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u =new User(6,"ahmed","marwen",54076033,07156247,"bassem.boukhattela@esprit.tn","jksjk","ytreza","fst",1546565);
        LogService serl =new LogService();
        UserService ser = new UserService();
        Organisateur org = new Organisateur(1, "nom_org", "prenom_org", 7878, 989, "mail_org", "username_org", "password_org", "raison_social_org", "secteur_activite_org", 5454, "site_web");
         OrganisateurService sero=new OrganisateurService();
         Admin adm =new Admin(3, "karim", "hagi", 4, "jamel", "tunisie", "vvv");
         AdminService seradm = new AdminService();
         
        try {
            //ser.addUser(u);
            //ser.updateUser(u);
            //ser.deleteUser(u);
           // ser.getAllUsers().forEach(e->System.out.println(e));
             //ser.findUserById(3);
            //sero.addOrganisateur(org);
           // sero.updateOrganisateur(or);
          // sero.deleteOrganisateur(or);
           sero.getAllOrganisateurs().forEach(e->System.out.println(e));
           //sero.findOrganisateurById(3);
           //seradm.addAdmin(adm);
          // seradm.updateAdmin(adm);
           //seradm.deleteAdmin(adm);
           //seradm.getAllAdmin().forEach(e->System.out.println(e));
           //seradm.findAdminById(2);
          // serl.log(gv,ggfgd);
           
        } catch (SQLException ex) {
            Logger.getLogger(Gestionuser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
    
    
}}

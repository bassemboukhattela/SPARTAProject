/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Admin;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import services.AdminService;

/**
 * FXML Controller class
 *
 * @author Bassem
 */
public class InscAdminFXMLController implements Initializable {

    @FXML
    private TextField tfnomadm;
    @FXML
    private TextField tfprenomadm;
    @FXML
    private TextField tfmatricule;
    @FXML
    private TextField tfposte;
    @FXML
    private PasswordField tfusernameadm;
    @FXML
    private PasswordField tfpasswrdadm;
    @FXML
    private Button save;
    @FXML
    private Button cancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addAdmin(ActionEvent event) {
        Admin ad = new Admin();
        ad.setNom_adm(tfnomadm.getText());
        ad.setPrenom_adm(tfprenomadm.getText());
        ad.getMatricule_adm(Integer.parseInt(tfmatricule.getText()));
        ad.setPoste_adm(tfposte.getText());
        ad.setUsername_adm(tfusernameadm.getText());
        ad.setPassword_adm(tfpasswrdadm.getText());
        AdminService seradm = new AdminService();
        try {
            seradm.addAdmin(ad);
        } catch (SQLException ex) {
            Logger.getLogger(InscAdminFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }

    @FXML
    private void cancel(ActionEvent event) {
        tfnomadm.clear();
        tfprenomadm.clear();
        tfmatricule.clear();
        tfposte.clear();
        tfusernameadm.clear();
        tfpasswrdadm.clear();
        
        
        
        
    }
    
}

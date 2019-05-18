/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Organisateur;
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
import services.OrganisateurService;

/**
 * FXML Controller class
 *
 * @author Bassem
 */
public class InscOrgFXMLController implements Initializable {

    @FXML
    private TextField tfnomorg;
    @FXML
    private TextField tfprnomorg;
    @FXML
    private TextField tftelorg;
    @FXML
    private TextField tfcinorg;
    @FXML
    private TextField tfmailorg;
    @FXML
    private TextField tfraisonsocial;
    @FXML
    private TextField tfsecteuractivie;
    @FXML
    private TextField tfnumcartpro;
    @FXML
    private TextField tfsiteweb;
    @FXML
    private PasswordField tfusernameorg;
    @FXML
    private PasswordField tfpasswordorg;
    @FXML
    private Button savorg;
    @FXML
    private Button cacelorg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addOrganisateur(ActionEvent event) {
        try {
            Organisateur org = new Organisateur();
            org.setNom_org(tfnomorg.getText());
            org.setPrenom_org(tfprnomorg.getText());
            org.setTel_org(Integer.parseInt(tftelorg.getText()));
            org.setCin_org(Integer.parseInt(tfcinorg.getText()));
            org.setMail_org(tfmailorg.getText());
            org.setUsername_org(tfusernameorg.getText());
            org.setPassword_org(tfpasswordorg.getText());
            org.setRaison_social_org(tfraisonsocial.getText());
            org.setSecteur_activite_org(tfsecteuractivie.getText());
            org.setNum_carte_pro(Integer.parseInt(tfnumcartpro.getText()));
            org.setSite_web(tfsiteweb.getText());
            OrganisateurService serorg = new OrganisateurService();
            serorg.addOrganisateur(org);
        } catch (SQLException ex) {
            Logger.getLogger(InscOrgFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }

    @FXML
    private void cancelorg(ActionEvent event) {
        
       tfnomorg.clear();
       tfprnomorg.clear();
       tftelorg.clear();
       tfcinorg.clear();
       tfmailorg.clear();
       tfusernameorg.clear();
       tfpasswordorg.clear();
       tfraisonsocial.clear();
       tfsecteuractivie.clear();
       tfnumcartpro.clear();
       tfsiteweb.clear();
        
        
        
        
        
    }
    
}

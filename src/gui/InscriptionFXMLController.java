/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.User;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import services.UserService;

/**
 * FXML Controller class
 *
 * @author Bassem
 */
public class InscriptionFXMLController implements Initializable {

    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfprenom;
    @FXML
    private TextField tftel;
    @FXML
    private TextField tfcin;
    @FXML
    private TextField tfmail;
    @FXML
    private TextField tfusername;
    @FXML
    private TextField tfpassword;
    @FXML
    private TextField tfuniversite;
    @FXML
    private TextField tfcartetudiant;
    @FXML
    private Button save;
    @FXML
    private Button cancel;
    @FXML
    private ImageView imgus;
    @FXML
    private AnchorPane anc;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void addUser(ActionEvent event) {
        User u= new User();
        u.setNom(tfnom.getText());
        u.setPrenom(tfprenom.getText());
        u.setTel(Integer.parseInt(tftel.getText()));
        u.setCin(Integer.parseInt(tfcin.getText()));
        u.setMail(tfmail.getText());
        u.setUsername(tfusername.getText());
        u.setPassword(tfpassword.getText());
        u.setUniversite(tfuniversite.getText());
        u.setNum_carte_etudiant(Integer.parseInt(tfcartetudiant.getText()));
         UserService ser = new UserService();
        try {
            ser.addUser(u);
        } catch (SQLException ex) {
            Logger.getLogger(InscriptionFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void cancel(ActionEvent event) {
      tfnom.clear();
      tfprenom .clear();
      tftel.clear();
      tfcin.clear();
      tfmail.clear();
      tfusername.clear();
      tfpassword.clear();
      tfuniversite.clear();
      tfcartetudiant.clear();
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Bassem
 */
public class BoardAdminFXMLController implements Initializable {

    @FXML
    private Button blc;
    @FXML
    private Button brc;
    @FXML
    private Button bsc;
    @FXML
    private Button blo;
    @FXML
    private Button bro;
    @FXML
    private Button bso;
    @FXML
    private Button bla;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getAllUsers(ActionEvent event) {
    }

    @FXML
    private void findUserById(ActionEvent event) {
    }

    @FXML
    private void deleteUser(ActionEvent event) {
    }

    @FXML
    private void getAllOrganisateurs(ActionEvent event) {
    }

    @FXML
    private void findOrganisateurById(ActionEvent event) {
    }

    @FXML
    private void deleteOrganisateur(ActionEvent event) {
    }

    @FXML
    private void getAllAdmin(ActionEvent event) {
    }
    
}

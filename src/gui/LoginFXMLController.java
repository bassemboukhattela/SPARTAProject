/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import services.LogService;

/**
 * FXML Controller class
 *
 * @author Bassem
 */
public class LoginFXMLController implements Initializable {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onLogin(ActionEvent event) throws SQLException {
     if (!usernameField.getText().matches("[a-zA-Z0-9_]{4,}")) {
            return;
        }
        if (passwordField.getText().isEmpty()) {
            return;
        }
       LogService lser =new LogService();
        int status = lser.log(usernameField.getText().trim().toLowerCase(), passwordField.getText());  

        switch (status) {
            case 0: {
                Stage stage = (Stage) usernameField.getScene().getWindow();

                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/GUI/System.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(LoginFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                }
                stage.setScene(new Scene(root));
            }
            break;
            case 1: {
                Stage stage = (Stage) usernameField.getScene().getWindow();

                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/GUI/System1.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(LoginFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                }
                stage.setScene(new Scene(root));
            }
            break;
            case 2: {
                Stage stage = (Stage) usernameField.getScene().getWindow();

                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/GUI/System2.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(LoginFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                }
                stage.setScene(new Scene(root));
            }
            break;
            case -1:
                JOptionPane.showMessageDialog(null, "Connection Failed");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Username or password wrong");
                break;
        }
    }
    
}

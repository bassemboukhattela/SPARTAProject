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
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.UserService;

/**
 * FXML Controller class
 *
 * @author Bassem
 */
public class AffichUsersFXMLController implements Initializable {

    @FXML
    private TableView<User> table;
    private TableColumn firstNameCol;
    private TableColumn secondNameCol;
    private TableColumn telNumCol;
    private TableColumn CinCol;
    private TableColumn mailCol;
    private TableColumn usernameCol;
    private TableColumn passwordCol;
    private TableColumn univerCol;
    private TableColumn cetudCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        firstNameCol = new TableColumn("Nom");
        secondNameCol = new TableColumn("Prenom");
        telNumCol = new TableColumn("tel");
        CinCol = new TableColumn("Cin");
        mailCol = new TableColumn("Mail");
        //usernameCol = new TableColumn("Username");
        //passwordCol = new TableColumn("Password");
        univerCol = new TableColumn("Universite");
        cetudCol = new TableColumn("Num carte etudiant");
        firstNameCol.setCellValueFactory(new PropertyValueFactory("nom"));
        secondNameCol.setCellValueFactory(new PropertyValueFactory("Prenom"));
        telNumCol.setCellValueFactory(new PropertyValueFactory("numTel"));
        CinCol.setCellValueFactory(new PropertyValueFactory("Cin"));
        mailCol.setCellValueFactory(new PropertyValueFactory("Mail"));
       // usernameCol.setCellValueFactory(new PropertyValueFactory("Username"));
       // passwordCol.setCellValueFactory(new PropertyValueFactory("Password"));
        univerCol.setCellValueFactory(new PropertyValueFactory("Universite"));
        cetudCol.setCellValueFactory(new PropertyValueFactory("Num carte etudiant"));
        table.getColumns().addAll(firstNameCol, secondNameCol,telNumCol , CinCol ,mailCol ,univerCol,cetudCol);
        UserService us = new UserService();
        try {
            table.setItems(FXCollections.observableArrayList(us.getAllUsers()));
        } catch (SQLException ex) {
            Logger.getLogger(AffichUsersFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

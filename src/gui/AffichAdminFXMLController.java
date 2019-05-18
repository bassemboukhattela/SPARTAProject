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
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.AdminService;

/**
 * FXML Controller class
 *
 * @author Bassem
 */
public class AffichAdminFXMLController implements Initializable {

    @FXML
    private TableView<Admin> tableadm;
    private TableColumn firstNameCol;
    private TableColumn secondNameCol;
    private TableColumn posteCol;
    private TableColumn matriculeCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         firstNameCol = new TableColumn("Nom");
        secondNameCol = new TableColumn("Prenom");
        posteCol = new TableColumn("Poste");
        matriculeCol = new TableColumn("Matricule");
        firstNameCol.setCellValueFactory(new PropertyValueFactory("nom_adm"));
        secondNameCol.setCellValueFactory(new PropertyValueFactory("prenom_adm"));
        posteCol.setCellValueFactory(new PropertyValueFactory("poste_adm"));
        matriculeCol.setCellValueFactory(new PropertyValueFactory("matricule_adm"));
        tableadm.getColumns().addAll(firstNameCol, secondNameCol,posteCol , matriculeCol);
        AdminService admser =new AdminService();
        try {
            tableadm.setItems(FXCollections.observableArrayList(admser.getAllAdmin()));
        } catch (SQLException ex) {
            Logger.getLogger(AffichAdminFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}

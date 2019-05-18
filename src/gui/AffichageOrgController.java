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
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.OrganisateurService;

/**
 * FXML Controller class
 *
 * @author Bassem
 */
public class AffichageOrgController implements Initializable {

    @FXML
      private TableView<Organisateur> tableorg;
    private TableColumn firstNameCol;
    private TableColumn secondNameCol;
    private TableColumn telNumCol;
    private TableColumn CinCol;
    private TableColumn mailCol;
    private TableColumn raison_social_org;
    private TableColumn secteur_activite_org;
    private TableColumn num_carte_pro;
    private TableColumn site_web;

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
        num_carte_pro = new TableColumn("Num carte pro");
        site_web = new TableColumn("Site web");
       raison_social_org = new TableColumn("Raison social");
        secteur_activite_org = new TableColumn("Secteur activite");
        
        firstNameCol.setCellValueFactory(new PropertyValueFactory("nom_org"));
        secondNameCol.setCellValueFactory(new PropertyValueFactory("prenom_org"));
        telNumCol.setCellValueFactory(new PropertyValueFactory("tel_org"));
        CinCol.setCellValueFactory(new PropertyValueFactory("cin_org"));
        mailCol.setCellValueFactory(new PropertyValueFactory("mail_org"));
        num_carte_pro.setCellValueFactory(new PropertyValueFactory(" num_carte_pro"));
       site_web.setCellValueFactory(new PropertyValueFactory("site_web"));
        raison_social_org.setCellValueFactory(new PropertyValueFactory("raison_social_org"));
        secteur_activite_org.setCellValueFactory(new PropertyValueFactory("secteur_activite_org"));
        tableorg.getColumns().addAll(firstNameCol, secondNameCol,telNumCol , CinCol ,mailCol,raison_social_org,secteur_activite_org,num_carte_pro,site_web);
       OrganisateurService orgser=new OrganisateurService();
       
       
        try {
            tableorg.setItems(FXCollections.observableArrayList(orgser.getAllOrganisateurs()));
        } catch (SQLException ex) {
            Logger.getLogger(AffichageOrgController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }    
    
}

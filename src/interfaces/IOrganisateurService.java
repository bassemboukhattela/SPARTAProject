/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Organisateur;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bassem
 */
public interface IOrganisateurService {
    public void addOrganisateur(Organisateur org) throws SQLException;

    public void updateOrganisateur(Organisateur org) throws SQLException;

    public void deleteOrganisateur(Organisateur org) throws SQLException;

    public ArrayList<Organisateur> getAllOrganisateurs() throws SQLException;

    public Organisateur findOrganisateurById(int id) throws SQLException;

    
}

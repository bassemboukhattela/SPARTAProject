/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Admin;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bassem
 */
public interface IAdminService {
    
    public void addAdmin(Admin adm) throws SQLException;

    public void updateAdmin(Admin adm) throws SQLException;

    public void deleteAdmin(Admin adm) throws SQLException;

    public ArrayList<Admin> getAllAdmin() throws SQLException;

    public Admin findAdminById(int id) throws SQLException;
}

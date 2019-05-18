/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.User;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bhk
 */
public interface IUserService {

    public void addUser(User u) throws SQLException;

    public void updateUser(User u) throws SQLException;

    public void deleteUser(User u) throws SQLException;

    public ArrayList<User> getAllUsers() throws SQLException;

    public User findUserById(int id) throws SQLException;

}

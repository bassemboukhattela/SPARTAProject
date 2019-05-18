/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.SQLException;

/**
 *
 * @author Bassem
 */
public interface ILogService {
    public int log(String username,String pmd) throws SQLException;

    
}

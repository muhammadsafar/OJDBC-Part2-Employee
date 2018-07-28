/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class FunctionDAO implements InterfaceDAO{

    public Connection connection;

    public FunctionDAO(Connection connection) {
        this.connection = connection;
    }
    
    
    @Override
    public boolean executeDML(String query) {
        boolean test = false;
        try {

            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FunctionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return test;
    }

    /**
     * 
     * @param query
     * @return 
     */
    @Override
    public List<Object> getDatas(String query) {
        
        List<Object> datas = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            int cols = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] object = new Object[cols];

                for (int i = 0; i < cols; i++) {
                    object[i] = rs.getObject(i + 1);
                }
                datas.add(object);
            }
        } catch (Exception e) {
        }
        return datas;
    } 
    /**
     * 
     * @param query
     * @return 
     */
    @Override
    public Object getById(String query) {
    Object data = new Object();
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            int column = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                Object item[] = new Object[column];
                for (int i = 0; i < column; i++) {
                    item[i] = resultSet.getObject(i);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FunctionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;

    }
    
    
}

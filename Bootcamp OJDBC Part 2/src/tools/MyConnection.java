/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;


/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class MyConnection {
    
    private Connection connect;
    
    public Connection getConnection(){
        try {
            OracleDataSource ods  = new OracleDataSource();
            
            ods.setServerName("localhost");
//            ods.setDatabaseName("HR");
            ods.setPortNumber(1521);
            ods.setUser("system");
            ods.setPassword("bismillah");
            ods.setDriverType("thin");
            ods.setServiceName("XE");
            
            connect = ods.getConnection();
            connect.createStatement().execute("alter session set " + " current_schema=hr");
            //connection for ods
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    return connect;
    }
}

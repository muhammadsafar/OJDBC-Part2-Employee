/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class RegionDAO {
    
    public FunctionDAO fdao;

    public RegionDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public boolean insert(Region region) {
        String query = "insert into regions"
                + "VALUES (" + region.getRegionId() + ","
                + region.getRegionName() + ")";

        return this.fdao.executeDML(query);
    }
    
    public boolean delete(int regionId) {
        String delete = "delete from regions where region_id = " + regionId;
        return this.fdao.executeDML(delete);
    }
    
    public boolean update(Region region) {
        String update = "update from regions set region_name = "
                + region.getRegionName() + " where region_id = "
                + region.getRegionId();
        return this.fdao.executeDML(update);
    }
    
    public List<Object> getAllDatas(){
    
        return this.fdao.getDatas("select * from regions");
        
    }
    
    public List<Object> getAllDatasSort(String category, String sort){
     return this.fdao.getDatas("select * from regions oreder by asc");
    }
    
    public List<Object> search(String category, String data){
    
        return this.fdao.getDatas("SELECT * FROM Regions WHERE " + category + " LIKE '%" + data + "%'");
    }
    
     public Object getById(int regionId){
        return this.fdao.getById("SELECT * FROM Regions WHERE region_id="+regionId);
    }
    
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDAO;
import entities.Region;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class RegionController {
    
//    private Connection connection;
    private RegionDAO regionDAO;

    public RegionController(Connection connection) {
        this.regionDAO  = new RegionDAO(connection);
    }
    
    public boolean save(int regionId, String regionName) {
        return this.regionDAO.insert(new Region(regionId, regionName));
    }
    
    public boolean edit(int regionId, String regionName){
            return this.regionDAO.update(new Region(regionId, regionName));
    }
    
    public boolean drop(int regionId){
            return this.regionDAO.delete(regionId);
    }
    
    public List<Region> getAllDatas() {
        return this.castToRegion(this.regionDAO.getAllDatas());

    }

    public List<Region> getAllDatasSort(String category, String sort) {
        return this.castToRegion(this.regionDAO.getAllDatasSort(category, sort));
    }
    
    public List<Region> find (String category, String data){
        return this.castToRegion(this.regionDAO.search(category, data));
    
    }
       
    
    public Object findById(String regionId) {
        return this.regionDAO.getById(Integer.parseInt(regionId));
    }
    
    public List<Region> castToRegion(List<Object> datas) {

        List<Region> allDatas = new ArrayList<>();
        for (Object allData : this.regionDAO.getAllDatas()) {

            Object[] temp = (Object[]) allData;

            Region region = new Region(Integer.parseInt(temp[0].toString()), temp[1].toString());
            allDatas.add(region);
        }
        return allDatas;
    }
    
}

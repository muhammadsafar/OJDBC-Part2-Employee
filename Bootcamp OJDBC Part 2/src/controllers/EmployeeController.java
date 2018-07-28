/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EmployeeDAO;
import entities.Employee;
import entities.Region;
import java.sql.Connection;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class EmployeeController {
    
    private EmployeeDAO employeeDAO;
    private Connection connection;
    
    
            
    public EmployeeController(Connection connection) {
        this.employeeDAO = new EmployeeDAO(connection);
    }
    
    public boolean save(int employeeId, String firstName, String lastName,
            String email, String phoneNumber, String hireDate, String jobId,
            int salary, double commissionPct, String managerId, String departmentId) {

        Object temp = hireDate;
        return this.employeeDAO.insert(new Employee(employeeId, firstName, lastName, email, phoneNumber,
                hireDate,
                jobId, salary, commissionPct,
                managerId, departmentId));
    }
    
    public boolean edit(int employeeId, String firstName, String lastName,
            String email, String phoneNumber, String hireDate, String jobId,
            int salary, double commissionPct, String managerId, String departmentId) {

        Object temp = hireDate;
        return this.employeeDAO.insert(new Employee(employeeId, firstName, lastName, email, phoneNumber,
                hireDate,
                jobId, salary, commissionPct,
                managerId, departmentId));
    }
    
        
    public boolean drop(int regionId){
            return this.employeeDAO.delete(regionId);
    }
    
    public List<Employee> getAllDatas(){
     return this.castToEmployee(this.employeeDAO.getAllData());
    
    }
    
    public List<Employee> getAllDatasSort (String category, String sort){
    
        return this.castToEmployee(this.employeeDAO.getAllDatasSort(category, sort));
    }
    
    public List<Employee> find (String category, String data){
        return this.castToEmployee(this.employeeDAO.search(category, data));
    
    }
    
    
    public List<Employee> castToEmployee(List<Object> datas){

        
        List<Employee> allDatas = new ArrayList<>();
        for (Object allData : this.employeeDAO.getAllData()) {
            Object[] temp = (Object[]) allData;
            
            Date createdDate = (Date) temp[5];
            
            Employee employee = new Employee(Integer.parseInt(temp[0].toString()),
                    temp[1].toString(),
                    temp[2].toString(), 
                    temp[3].toString(), 
                    temp[4].toString(), 
                    temp[5], 
                    temp[6], 
                    temp[7], 
                    temp[8], 
                    temp[9], 
                    temp[10]);
                       
            allDatas.add(employee);
        }
        return allDatas;
    }
}

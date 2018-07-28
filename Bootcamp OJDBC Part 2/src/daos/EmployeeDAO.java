/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Employee;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class EmployeeDAO {
    
    public Connection connection;
    public FunctionDAO functionDAO;

   
    public EmployeeDAO(Connection connection) {
        this.functionDAO  = new FunctionDAO(connection);
    }
    
    public boolean insert(Employee employee){
    
        String query = "insert into employees values (" + employee.getEmployeeId() + ","
                + employee.getFirstName() + "," + employee.getLastName() + "," + employee.getEmail() + ","
                + employee.getPhoneNumber() + "," + employee.getHireDate() + "," + employee.getJobId() + ","
                + employee.getSalary() + "," + employee.getCommissionPct() + "," + employee.getManagerId() + ","
                + employee.getDepartmentId() + ")";
        return this.functionDAO.executeDML(query);
    }
    
    public boolean update(Employee employee){
        
        String query = "update employees set fist_name = " + employee.getFirstName() + " where employee_id = "
                + employee.getEmployeeId();
        return this.functionDAO.executeDML(query);
    }
    
    public boolean delete (int employeeId){
        String query = "delete from employees where employee_id = "+employeeId;
        return this.functionDAO.executeDML(query);
    }
    
    public List<Object> getAllData(){
    
        String query = "select * from employees";
        return this.functionDAO.getDatas(query);
    }
    
    public List<Object> getAllDatasSort(String category, String sort) {
        return this.functionDAO.getDatas("select * from regions order by asc");
    }
    
    public List<Object> search(String category, String data) {
        return this.functionDAO.getDatas("select * from  where " + category + "like '%" + data + "%'");
    }
}

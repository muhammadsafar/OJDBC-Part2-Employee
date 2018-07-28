/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

//import controllers.EmployeeController;
import controllers.RegionController;
import entities.Employee;
import java.sql.Connection;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class ManualTester {
    
    public static void main(String[] args) {
//        System.out.println(new MyConnection().getConnection());

        Connection connection = new MyConnection().getConnection();
//        
//        String regionId="41";
//        String regionName="Muhammad";
//        
//        RegionController regionController=new RegionController(connection);
//                       
////        System.out.println(regionController.save(Integer.parseInt(regionId),regionName));
//        
////        System.out.println(regionController.edit(regionId, regionName));
//System.out.println(regionController.drop(Integer.parseInt(regionId)));


        String empId = "901";
        String empFn = "Muhammad";
        String empLn = "tomang";
        String empE = "musa.gmail.com";
        String empPn = "12234346";
        String empHd = "2012-12-12";
        String empJi = "ST_MAN";
        String empS = "909090";
        String empCom = "0.5";
        String empMan = "114";
        String empDep = "100";
        
//        EmployeeController employeeController = new EmployeeController(connection);
//        System.out.println(employeeController.save(empId, empFn, empLn, empE, empPn, empHd, empJi, 
//                empS, empCom, empMan, empDep));
        
//        System.out.println(employeeController.edit(empId, empFn, empLn, empE, empPn, empHd, empJi, 
//                empS, empCom, empMan, empDep));
//        
        
//        for (Employee employee : employeeController.binding()) {
//            System.out.println(employee.getEmployeeId()+employee.getFirstName()+employee.getLastName()+employee.getEmail()
//                    +employee.getPhoneNumber()+employee.getHireDate()+employee.getJobId()+employee.getSalary()
//                    +employee.getCommissionPct()+employee.getManagerId()+employee.getDepartmentId()
//            );
//        }
//
//        System.out.println(employeeController.drop(Integer.parseInt(empId)));
        //delete
        
        
//        for (Employee employee : employeeController.findAll("first_name", "a")) {
//            System.out.println(employee.getEmployeeId()+employee.getFirstName()+employee.getLastName()+employee.getEmail()
//                    +employee.getPhoneNumber()+employee.getHireDate()+employee.getJobId()+employee.getSalary()
//                    +employee.getCommissionPct()+employee.getManagerId()+employee.getDepartmentId()
//            );
//        }
        
//        for (Employee employee : employeeController.bindingSort("first_name", "asc")) {
//            System.out.println(employee.getEmployeeId()+employee.getFirstName()+employee.getLastName()+employee.getEmail()
//                    +employee.getPhoneNumber()+employee.getHireDate()+employee.getJobId()+employee.getSalary()
//                    +employee.getCommissionPct()+employee.getManagerId()+employee.getDepartmentId()
//            );
//        }
        
        
//        System.out.println(employeeController.findById(3).getEmployeeId());

    }
    
}

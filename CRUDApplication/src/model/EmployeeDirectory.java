/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jhalaksurve
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> directory;
    
    public EmployeeDirectory(){
    
    this.directory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Employee> directory) {
        this.directory = directory;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        directory.add(newEmployee);
        return newEmployee;
    }
}

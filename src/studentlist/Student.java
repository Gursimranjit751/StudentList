/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author fagun at 22/01/2024
 */
public class Student {
    private String name;
    private String studentID;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getStudentID() {
        return studentID;
    }
    
  
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}

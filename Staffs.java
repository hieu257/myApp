/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author vanHieu
 */
public class Staffs {
    private int id;
    private String fullname;
    private int gender;
    private String address;
    private String phonenumber;
    private Date dob;
    private String email;
    private String password;

    public Staffs() {
    }

    public Staffs(int id, String fullname, int gender, String address,String phonenumber, Date dob, String email, String password) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.phonenumber = phonenumber;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Staffs{" + "id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", address=" + address + ", phonenumber=" + phonenumber + ", dob=" + dob + ", email=" + email + ", password=" + password + '}';
    }

    

    
    
    
}

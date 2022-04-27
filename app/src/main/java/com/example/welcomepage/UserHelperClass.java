package com.example.welcomepage;

public class UserHelperClass {

    String name, phone, age, gender, jobreq, address, email, aadhar, password;

    public UserHelperClass() {

    }

    public UserHelperClass(String name, String phone, String age, String gender, String jobreq, String address, String email, String aadhar, String password) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.jobreq = jobreq;
        this.address = address;
        this.email = email;
        this.aadhar = aadhar;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobreq() {
        return jobreq;
    }

    public void setJobreq(String jobreq) {
        this.jobreq = jobreq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

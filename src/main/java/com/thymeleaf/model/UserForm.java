package com.thymeleaf.model;

public class UserForm {

    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private boolean maried;
    private String profession;
    
  

    public UserForm(String name, String email, String password, String gender, String address, boolean maried,
            String profession) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.address = address;
        this.maried = maried;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMaried() {
        return maried;
    }

    public void setMaried(boolean maried) {
        this.maried = maried;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

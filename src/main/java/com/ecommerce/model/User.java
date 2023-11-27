package com.ecommerce.model;

public class User {
    private int id;
    private String name;
    private String username;
    private String mail;
    private String adress;
    private String telephone;

    private  String rol;
    private String password;

    private String city;
    private boolean enable;

    public User() {
    }

    public User(int id, String name, String username, String mail, String adress, String telephone, String rol, String password, String city, boolean enable) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.mail = mail;
        this.adress = adress;
        this.telephone = telephone;
        this.rol = rol;
        this.password = password;
        this.city = city;
        this.enable = enable;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", mail='" + mail + '\'' +
                ", adress='" + adress + '\'' +
                ", telephone='" + telephone + '\'' +
                ", rol='" + rol + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                ", enable=" + enable +
                '}';
    }
}

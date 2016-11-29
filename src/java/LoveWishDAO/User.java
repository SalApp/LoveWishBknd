/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoveWishDAO;

import java.util.Date;

/**
 *
 * @author Armando
 */
public class User implements java.io.Serializable  {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String sex;
    private Date birthdate;
    private String username;
    private String city;

    public User(String name, String lastname, String email, String password, String sex, Date birthdate, String username, String city) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.birthdate = birthdate;
        this.username = username;
        this.city = city;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}

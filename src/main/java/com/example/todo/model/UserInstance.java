package com.example.todo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserInstance {

//    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    private @Id @GeneratedValue Long id;
    private String name;
    private @JsonIgnore String password;
    private String email;

    public UserInstance() {}

    public UserInstance(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public Long getId() { return this.id; }
    public String getName() { return this.name; }
    public String getEmail() { return this.email; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String oldPassword, String newPassword) {
        if (Objects.equals(this.password, oldPassword)) { this.password = newPassword; }
    }

    @Override
    public int hashCode() { return Objects.hash(this.id, this.name, this.email); }

//    @Override
//    public String toString() {
//        return "User{" + "id=" + id + ", name=" + name;
//    }
}

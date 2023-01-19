package com.example.todo.model;


import java.util.Objects;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TodoItem {

    private @ManyToOne UserInstance user;

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;
    private String status;

    public TodoItem() {}

    public TodoItem (String name, String description, UserInstance user) {
        this.name = name;
        this.description = description;
        this.status = "Not started";
        this.user = user;
    }

    public Long getId() { return this.id; }

    public String getNam() { return this.name; }

    public String getDescription() { return this.description; }

    public String getStatus() { return this.status; }

    public void setId(Long id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setDescription(String description) { this.description = description; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public int hashCode() { return Objects.hash(this.id, this.name, this.description, this.status, this.user); }

}

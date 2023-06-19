package com.example.exam_myuser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    int id;
    String username;
    int age;
    int num_groups;

    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum_groups() {
        return num_groups;
    }

    public void setNum_groups(int num_groups) {
        this.num_groups = num_groups;
    }
}

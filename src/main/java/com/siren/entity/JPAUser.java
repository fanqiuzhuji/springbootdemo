package com.siren.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 22-1-22.
 */
@Data
@Entity(name = "user")
public class JpaUser {
    //    这个版本时间 20220122 22:03,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

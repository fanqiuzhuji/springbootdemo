package com.siren.entity;

import lombok.Data;

/**
 * Created by Administrator on 22-1-21.
 */
@Data
public class User {
    //    2022年2月24日 10:27
    private Integer id;

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

    private String username;
    private String password;

}

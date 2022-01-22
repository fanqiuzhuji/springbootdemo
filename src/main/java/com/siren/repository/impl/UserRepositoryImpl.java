package com.siren.repository.impl;

import com.siren.entity.User;
import com.siren.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 22-1-21.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> fandAll() {
        return jdbcTemplate.query(
                "SELECT *  FROM user",
                new BeanPropertyRowMapper<User>(User.class)
        );
    }

    @Override
    public User findById(Integer id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM user WHERE id = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<User>(User.class)
        );
    }

    @Override
    public int save(User user) {
        return jdbcTemplate.update(
                "INSERT INTO user(username,password) VALUES (?,?)",
                user.getUsername(),
                user.getPassword()
        );
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update(
                "UPDATE user SET username = ?,password = ? WHERE id = ?",
                user.getUsername(),
                user.getPassword(),
                user.getId()
        );
    }

    @Override
    public int deleteById(Integer id) {
        return jdbcTemplate.update(
                "DELETE FROM user WHERE id = ?",
                id
        );
    }
}

package com.siren.repository;

import com.siren.entity.User;

import java.util.List;

/**
 * Created by Administrator on 22-1-21.
 */
public interface UserRepository {
    public List<User> fandAll();

    public User findById(Integer id);

    public int save(User user);

    public int update(User user);

    public int deleteById(Integer id);
}

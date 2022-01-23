package com.siren.hadler;

import com.siren.entity.JpaUser;
import com.siren.entity.User;
import com.siren.repository.JpaUserRepository;
import com.siren.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 22-1-21.
 */
@RestController
@RequestMapping("/user")
public class UserHandler {

    //以下用的spirngboot JPA UserRepository
    @Autowired
    private JpaUserRepository jpaUserRepository;

    @GetMapping("findAll")
    public List<JpaUser> findAll() {
        return jpaUserRepository.findAll();
    }

    /*//以下用的JDBCTemplate UserRepository
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userRepository.fandAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public int save(User user) {
        return userRepository.save(user);
    }

    @PostMapping("/update")
    public int update(User user) {
        return userRepository.update(user);
    }

    @PostMapping("/deleteById")
    public int deleteById(User user) {
        return userRepository.deleteById(user.getId());
    }*/
}

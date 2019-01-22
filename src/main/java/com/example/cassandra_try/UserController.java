package com.example.cassandra_try;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;


    @RequestMapping("users")
    public List<User> getAll(){
        return userDao.getAll();
    }

    @RequestMapping("add")
    public User save(){
        User user = new User();
        user.setUserid(4);
        user.setFname("鲸鱼");
        user.setLname("吴");
        return userDao.insert(user);
    }
}

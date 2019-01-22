package com.example.cassandra_try;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private CassandraTemplate template;

    public List<User> getAll() {
        return template.select("select * from users", User.class);
    }

    public User insert(User user) {
        return template.insert(user);
    }
}

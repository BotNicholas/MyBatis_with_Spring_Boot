package org.nicholas.mybatiswithspring.components;

import org.nicholas.mybatiswithspring.mappers.BlogMapper;
import org.nicholas.mybatiswithspring.mappers.UserMapper;
import org.nicholas.mybatiswithspring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public User findById(int id) {
        return userMapper.findById(id);
    }
}

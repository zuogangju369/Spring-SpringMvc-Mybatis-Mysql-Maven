package com.service;

import com.dao.UserMapper;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Feeling on 2014/12/8.
 */
@Service("userService")
public class UserServiceImp implements UserServiceI{
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(String id) {

        return userMapper.selectByPrimaryKey(id);
    }
}

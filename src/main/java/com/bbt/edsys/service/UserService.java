package com.bbt.edsys.service;

import java.util.List;

import com.bbt.edsys.common.model.User;
import com.bbt.edsys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    protected UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.selectUsers();
    }

}

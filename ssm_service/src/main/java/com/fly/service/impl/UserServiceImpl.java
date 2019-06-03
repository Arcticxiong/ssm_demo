package com.fly.service.impl;

import com.fly.mapper.UserInfoMapper;
import com.fly.pojo.UserInfo;
import com.fly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUsers() {
        return userInfoMapper.selectByExample(null);
    }
}

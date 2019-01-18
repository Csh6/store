package com.neuedu.controller;

import com.neuedu.dao.UserInfoMapper;
import com.neuedu.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

public class TextController {

    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfo findUser(@PathVariable Integer userid)
    {
        return userInfoMapper.selectByPrimaryKey(userid);
    }
}

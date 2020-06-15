package com.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.entity.vo.UserDO;
import com.service.inf.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserDO findById(Long id) {
        return null;
    }

    @Override
    public List<UserDO> listUser() {
        System.out.println("hello you wanna listUser !");

        UserDO userDO = new UserDO();
        userDO.setId(111L);
        userDO.setName("xiaoming");

        List<UserDO> list = new ArrayList<>();
        list.add(userDO);

        return list;
    }
}
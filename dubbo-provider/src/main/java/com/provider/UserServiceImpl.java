package com.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.entity.vo.UserDO;
import com.service.inf.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {


    @Override
    public UserDO findById(Long id) {
        return null;
    }

    @Override
    public List<UserDO> listUser() {
        System.out.println("hello you wanna listUser !");
        return null;
    }
}
package com.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.entity.vo.UserDO;
import com.service.inf.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Reference
    UserService userService;

    @GetMapping("/findById/{id}")
    public UserDO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/listUser")
    public List<UserDO> listUser() {
        return userService.listUser();
    }
}
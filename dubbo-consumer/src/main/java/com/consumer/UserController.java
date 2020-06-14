package com.consumer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.UserService;
import com.dubbo.entity.UserDO;

/**
* @类名称：HelloController
* @类描述：TODO
* @作者：Lv Ming
* @日期：2018年6月17日
* @版本：V1.0
*/
@RestController
@RequestMapping("/user")
public class UserController {

@Reference
UserService userService;

@GetMapping("/findById/{id}")
public UserDO findById(@PathVariable Long id){
return userService.findById(id);
}

@GetMapping("/listUser")
public List<UserDO> listUser(){
return userService.listUser();
}
}
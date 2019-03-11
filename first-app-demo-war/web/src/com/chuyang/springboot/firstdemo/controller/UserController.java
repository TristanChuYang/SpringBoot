package com.chuyang.springboot.firstdemo.controller;

import com.chuyang.springboot.firstdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.chuyang.springboot.firstdemo.repository.UserRepository;

/**
 * <br>
 * 标题: 用户 REST 接口<br>
 * 描述: RESTFul 格式<br>
 *
 * @author gordon
 * @date 2019/03/07
 */
@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping("/person/save")
    public User save(@RequestParam String name){
        User user = new User();
        user.setName(name);
        if (userRepository.save(user)){
            System.out.printf("用户对象： %s 保存成功\n",user);
        }
        return user;
    }

}

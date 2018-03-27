package com.fpfos.controller;

import com.fpfos.entity.User;
import com.fpfos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Fu Pengfei on 2018/3/27.
 */
@RestController
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping("find/age/{age}")
    public List<User> findByAge(@PathVariable Integer age){

        return userService.findByAge(age);
    }

    @GetMapping("find/hobbies/{hobbies}")
    public Page<User> findByHobbies(@PathVariable String hobbies){
        return userService.findByHobbies(hobbies,0,10);
    }
}

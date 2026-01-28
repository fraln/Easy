package com.example.demo.controllers;

import com.example.demo.models.entity.domain.TUser;
import com.example.demo.services.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserConteroller {
    @Resource
    private UserService userService;

    @GetMapping("/list")
    public List<TUser> getAll() {
        return userService.getAllUser();
    }

    @PostMapping("/add")
    public String add(TUser user) {
        return userService.addUser(user) ? "添加成功" : "添加失败";
    }
}

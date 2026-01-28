package com.example.demo.services;

import com.example.demo.models.entity.domain.TUser;
import com.example.demo.models.entity.service.TUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Resource
    private TUserService tUserService;

    public List<TUser> getAllUser() {
        return tUserService.list();
    }

    public boolean addUser(TUser user) {
        return tUserService.save(user);
    }
}

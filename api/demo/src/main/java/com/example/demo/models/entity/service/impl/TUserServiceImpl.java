package com.example.demo.models.entity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.models.entity.domain.TUser;
import com.example.demo.models.entity.mapper.TUserMapper;
import com.example.demo.models.entity.service.TUserService;
import org.springframework.stereotype.Service;

@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {
}

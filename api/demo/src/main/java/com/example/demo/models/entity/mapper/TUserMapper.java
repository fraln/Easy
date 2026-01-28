package com.example.demo.models.entity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.models.entity.domain.TUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserMapper extends BaseMapper<TUser> {
}

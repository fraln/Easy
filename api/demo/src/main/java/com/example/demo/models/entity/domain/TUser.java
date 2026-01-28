package com.example.demo.models.entity.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class TUser {
    private Long id;
    private String name;
    private int age;
}

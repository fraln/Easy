package com.example.demo.models.vm.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVm {
    @Schema(description = "用户id")
    private String id;
    @Schema(description = "用户名称")
    private String name;
    @Schema(description = "用户年龄")
    private String age;
}

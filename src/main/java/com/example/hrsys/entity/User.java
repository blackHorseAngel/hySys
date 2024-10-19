package com.example.hrsys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Description 管理员用户信息表
 * @Author zhangshenming
 * @Create 2024/10/17 22:01
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@ToString
public class User {
    //主键id
    private int id;
    //管理员姓名
    private String username;
    //管理员密码
    private String password;
    //管理员角色
    private List<Role> roles;
}

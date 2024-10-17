package com.example.hrsys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Description 权限信息
 * @Author zhangshenming
 * @Create 2024/10/17 22:07
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@ToString
public class Permission {
    //主键id
    private int id;
    //权限名称
    private String name;
    //权限编码
    private String code;
    //权限资源
    private String resource;
}

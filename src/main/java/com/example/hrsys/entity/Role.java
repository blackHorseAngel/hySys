package com.example.hrsys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Description 角色信息
 * @Author zhangshenming
 * @Create 2024/10/17 22:04
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@ToString
public class Role {
    //主键id
    private int id;
    //角色名称
    private String name;
    //角色编码
    private String code;
    //分类
    private int sort;
}

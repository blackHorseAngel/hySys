package com.example.hrsys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Description 部门类
 * @Author zhangshenming
 * @Create 2024/10/17 21:56
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@ToString
public class Department {
    //主键id
    private int id;
    //部门名称
    private String name;
    //部门编号
    private int number;
}

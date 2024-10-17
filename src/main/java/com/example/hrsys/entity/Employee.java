package com.example.hrsys.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @description: 员工类
 * @date: 2024/10/17 20:17
 * @author: zhangshenming
 * @version: 1.0
 * @since: JDK 17
 */
@Data
@AllArgsConstructor
@ToString
public class Employee {
    //主键id
    private int id;
    //员工姓名
    private String name;
    //员工年龄
    private int age;
    //员工性别
    private String gender;
    //员工号
    private int number;
    //员工部门
    private int depId;

}
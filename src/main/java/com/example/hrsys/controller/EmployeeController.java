package com.example.hrsys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description 员工的控制类
 * @Author zhangshenming
 * @Create 2024/10/18 22:11
 * @Version 1.0
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping("/add")
    public ModelAndView addEmployee(){
        return new ModelAndView("employee/addEmployee");
    }
}

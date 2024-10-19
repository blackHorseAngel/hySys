package com.example.hrsys.service;

import com.example.hrsys.entity.Employee;

import java.util.List;

/**
 * @Description 员工服务接口
 * @Author zhangshenming
 * @Create 2024/10/18 21:50
 * @Version 1.0
 */
public interface EmployeeService {
    /**
    * @Description 添加员工信息
    * @Author zhangshenming
    * @Param [employee]
    * @Create 2024/10/18 21:53
    * @Return int
    */
    int addEmployee(Employee employee);
    /**
     * @Description 删除员工信息
     * @Author zhangshenming
     * @Create 2024/10/18 21:51
     * @param id
     * @return int
     */
    int deleteEmployee(long id);
    /**
     * @Description 更新员工信息
     * @Author zhangshenming
     * @Create 2024/10/18 21:51
     * @param employee
     * @return int
     */
    int updateEmployee(Employee employee);
    /**
     * @Description 根据id获取员工信息
     * @param id
     * @Author zhangshenming
     * @Create 2024/10/18 21:51
     * @return com.example.hrsys.entity.Employee
     */
    Employee getEmployeeById(long id);

    /**
     * @Description 获取所有员工信息
     * @Author zhangshenming
     * @Create 2024/10/1
     * @return java.util.List<com.example.hrsys.entity.Employee>
     */
    List<Employee> getAllEmployees();

}

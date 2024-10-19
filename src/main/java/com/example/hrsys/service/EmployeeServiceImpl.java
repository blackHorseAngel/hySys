package com.example.hrsys.service;

import com.example.hrsys.dao.EmployeeDao;
import com.example.hrsys.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 员工服务实现类
 * @Author zhangshenming
 * @Create 2024/10/18 21:54
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public int addEmployee(Employee employee) {
        return employeeDao.insert(employee);
    }

    @Override
    public int deleteEmployee(long id) {
        return employeeDao.deleteById(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeDao.updateById(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeDao.selectById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.selectAll();
    }
}

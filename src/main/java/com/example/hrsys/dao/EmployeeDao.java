package com.example.hrsys.dao;

import com.example.hrsys.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: employee mapper
 * @date: 2024/10/16 15:45
 * @author: zhangshenming
 * @version: 1.0
 *
 */
//@Mapper
@Repository
public interface EmployeeDao {
    /**
     * @description: delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteById(Long id);

    /**
     * @description:  employee to table
     * @param employee employee
     * @return insert count
     */
    int insert(Employee employee);

    /**
     * insert record to table selective
     * @param employee employee
     * @return insert count
     */
   // int insertSelective(Employee employee);

    /**
     * @description: select by primary key
     *
     * @param id primary key
     * @return employee
     */
    Employee selectById(Long id);

    /**
     * @description: select all
     * @author: zhangshenming
     * @date: 2024/10/16 15:45
     * @return  list<employee>
     */
    List<Employee> selectAll();
    /**
     * update record selective
     *
     * @param employee the updated employee
     * @return update count
     */
    int updateById(Employee employee);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
//    int updateByPrimaryKey(Employee record);
}
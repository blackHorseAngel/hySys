package com.example.hrsys.dao;

import com.example.hrsys.entity.Department;
import org.springframework.stereotype.Repository;

/**
 * @description 部门表数据层接口
 * @author zhangshenming
 * @create 2024/10/17 22:08
 * @version 1.0
 */
//@Mapper
@Repository
public interface DepartmentDao {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteById(Long id);

    /**
     * insert record to table
     * @param department the record
     * @return insert count
     */
    int insert(Department department);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Department selectById(Long id);

    /**
     * update record selective
     * @param department the updated record
     * @return update count
     */
    int updateById(Department department);

}
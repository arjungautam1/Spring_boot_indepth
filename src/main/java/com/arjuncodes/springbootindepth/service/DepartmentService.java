/**
 * @author Arjun Gautam
 * Project :spring-boot-indepth
 * Date : 2021-06-17
 */
package com.arjuncodes.springbootindepth.service;

import com.arjuncodes.springbootindepth.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);

    public Department getDepartmentByName(String name);
}

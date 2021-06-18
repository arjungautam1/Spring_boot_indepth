/**
 * @author Arjun Gautam
 * Project :spring-boot-indepth
 * Date : 2021-06-17
 */
package com.arjuncodes.springbootindepth.service;

import com.arjuncodes.springbootindepth.error.DepartmentNotFoundException;
import com.arjuncodes.springbootindepth.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public Department updateDepartmentById(Long departmentId, Department department);

    public Department getDepartmentByName(String name);
}

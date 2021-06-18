/**
 * @author Arjun Gautam
 * Project :spring-boot-indepth
 * Date : 2021-06-17
 */
package com.arjuncodes.springbootindepth.controller;

import com.arjuncodes.springbootindepth.model.Department;
import com.arjuncodes.springbootindepth.service.DepartmentService;
import com.arjuncodes.springbootindepth.service.MapValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private MapValidationService mapValidationService;


    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);

   /* @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }*/

    @PostMapping("/departments")
    public ResponseEntity<?> saveDepartment(@Valid @RequestBody Department department, BindingResult result) {
        ResponseEntity<?> errorMap = mapValidationService.MapValidationService(result);
        if (errorMap != null) return errorMap;

        LOGGER.info("Save the department.");
        Department department1 = departmentService.saveDepartment(department);
        return new ResponseEntity<Department>(department1, HttpStatus.CREATED);

    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        LOGGER.info("Getting all the departments ");

        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartmentById(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String name) {
        return departmentService.getDepartmentByName(name);
    }

}

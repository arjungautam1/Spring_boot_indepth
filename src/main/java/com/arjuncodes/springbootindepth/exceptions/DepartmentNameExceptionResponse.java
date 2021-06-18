/**
 * @author Arjun Gautam
 * Project :spring-boot-indepth
 * Date : 2021-06-18
 */
package com.arjuncodes.springbootindepth.exceptions;

public class DepartmentNameExceptionResponse {
    private String departmentName;

    public DepartmentNameExceptionResponse(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

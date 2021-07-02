//package com.arjuncodes.springbootindepth.controller;
//
//import com.arjuncodes.springbootindepth.model.Department;
//import com.arjuncodes.springbootindepth.service.DepartmentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(DepartmentController.class)
//class DepartmentControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private DepartmentService departmentService;
//
//    private Department department;
//
//    @BeforeEach
//    void setUp() {
//        department = Department.builder()
//                .departmentAddress("Ahmedabad")
//                .departmentCode("IT-06")
//                .departmentName("IT")
//                .departmentId(1L)
//                .build();
//    }
//
//    @Test
//    void saveDepartment() throws Exception {
//        Department inputDepartment = Department.builder()
//                .departmentAddress("Ahmedabad")
//                .departmentCode("IT-06")
//                .departmentName("IT")
//                .build();
//
//        Mockito.when(departmentService.saveDepartment(inputDepartment))
//                .thenReturn(department);
//
//        mockMvc.perform(post("/departments")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "\t\"departmentName\":\"IT\",\n" +
//                        "\t\"departmentAddress\":\"Ahmedabad\",\n" +
//                        "\t\"departmentCode\":\"IT-06\"\n" +
//                        "}"))
//                .andExpect(status().isOk());
//
//    }
//
//    @Test
//    void getDepartmentById() throws Exception {
//        Mockito.when(departmentService.getDepartmentById(1L))
//                .thenReturn(department);
//
//        mockMvc.perform(get("/departments/1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.departmentName").
//                        value(department.getDepartmentName()));
//    }
//}
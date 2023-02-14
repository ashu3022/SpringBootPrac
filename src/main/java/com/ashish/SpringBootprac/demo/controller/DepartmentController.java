package com.ashish.SpringBootprac.demo.controller;

import com.ashish.SpringBootprac.demo.entity.Department;
import com.ashish.SpringBootprac.demo.error.DepartmentNotFoundException;
import com.ashish.SpringBootprac.demo.service.DepartmentService;
import com.ashish.SpringBootprac.demo.service.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
}
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
    return departmentService.fetchDepartmentList();
    };

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {


        return departmentService.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.deleteDepartmentById(departmentId);
    }

    @PutMapping("departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updatedepartment(departmentId,department);
    }
    @GetMapping("departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String name){
       return departmentService.fetchDepartmentByName(name);
    }
    @GetMapping("departments/count")
    public int countRecords(){
        return departmentService.countOfAllRecords();
    }
}

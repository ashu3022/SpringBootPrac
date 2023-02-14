package com.ashish.SpringBootprac.demo.service;

import com.ashish.SpringBootprac.demo.entity.Department;
import com.ashish.SpringBootprac.demo.error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {


   public  Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

  public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;
  public String deleteDepartmentById(Long departmentId);

  public Department updatedepartment(Long departmentId,Department newbody);

  public  Department fetchDepartmentByName(String name);

  public  int countOfAllRecords();
}



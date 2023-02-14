package com.ashish.SpringBootprac.demo.service;

import com.ashish.SpringBootprac.demo.entity.Department;
import com.ashish.SpringBootprac.demo.error.DepartmentNotFoundException;
import com.ashish.SpringBootprac.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DepartmentServiceImp implements  DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
    return departmentRepository.save(department);

    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
       // return departmentRepository.findById(departmentId).get();
      Optional<Department> department=departmentRepository.findById((departmentId));

      if(!department.isPresent()){
          throw new DepartmentNotFoundException("Department not found plz check id again");
      }
      return department.get();
    }

    @Override
    public String deleteDepartmentById(Long departmentId) {
         departmentRepository.deleteById(departmentId);
         return  departmentId+"deleted just now";
    }

    @Override
    public Department updatedepartment(Long departmentId,Department departmentNew) {
        Department old=departmentRepository.findById(departmentId).get();
        old.setDepartmentName(departmentNew.getDepartmentName());
        old.setDepartmentAddress(departmentNew.getDepartmentAddress());
        old.setDepartmentCode(departmentNew.getDepartmentCode());
        return departmentRepository.save(old);
    }


    @Override
    public Department fetchDepartmentByName(String name) {
        return departmentRepository.findByDepartmentNameIgnoreCase(name);
    }

    @Override
    public int countOfAllRecords() {
        return departmentRepository.findCountOfRecords();
    }
}

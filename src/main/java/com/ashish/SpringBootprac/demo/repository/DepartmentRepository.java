package com.ashish.SpringBootprac.demo.repository;

import com.ashish.SpringBootprac.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDepartmentName(String DepartmentName);
    public Department findByDepartmentNameIgnoreCase(String DepartmentName);

    //how to give this query output
    @Query(value = "Select Count(*) from Departments",nativeQuery = true)
    public int findCountOfRecords();

}

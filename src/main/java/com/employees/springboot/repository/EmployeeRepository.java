package com.employees.springboot.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employees.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	List<Employee> findByLastName(String lastName);
	Page<Employee> findByLastName(String lastName, Pageable pageable);
	Page<Employee> findByMalade(String lastName, Pageable pageable);
	List<Employee> findByMaladeIsTrueAndCoefficientLessThan(int coefitient);
	List<Employee> findByEmbaucheDateBetween(Date d1,Date d2);
	
	@Query("select e from Employee e where e.lastName like :x and e.coefficient between :y and :z")
	List<Employee> searchEmployees(@Param("x") String nom,@Param("y") int y ,@Param("z") int z);
}

package com.example.proyectoJavaDev.repository;

import com.example.proyectoJavaDev.entity.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    //EmployeeEntity findByEmployeeId(Integer employeeId);

    Optional<EmployeeEntity> findByEmployeeId(Integer integer);

    List<EmployeeEntity> findByStatus(String status);

    Page<EmployeeEntity> findByStatus(String status, Pageable pageable);
}

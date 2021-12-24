package com.oscalin.generics.theone.entity.repository;

import com.oscalin.generics.theone.entity.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,String> {
}

package com.oscalin.generics.theone.repository;

import com.oscalin.generics.theone.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,String> {
}

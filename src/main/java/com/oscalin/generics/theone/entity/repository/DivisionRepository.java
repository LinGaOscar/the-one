package com.oscalin.generics.theone.entity.repository;

import com.oscalin.generics.theone.entity.domain.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division,String> {
}

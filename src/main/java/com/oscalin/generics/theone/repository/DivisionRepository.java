package com.oscalin.generics.theone.repository;

import com.oscalin.generics.theone.domain.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division,String> {
}

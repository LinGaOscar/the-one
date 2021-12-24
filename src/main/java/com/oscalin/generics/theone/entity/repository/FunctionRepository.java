package com.oscalin.generics.theone.entity.repository;

import com.oscalin.generics.theone.entity.domain.Function;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FunctionRepository extends JpaRepository<Function,String> {
}

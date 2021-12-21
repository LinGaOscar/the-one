package com.oscalin.generics.theone.repository;

import com.oscalin.generics.theone.domain.Function;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FunctionRepository extends JpaRepository<Function,String> {
}

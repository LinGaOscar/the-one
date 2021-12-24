package com.oscalin.generics.theone.entity.repository;

import com.oscalin.generics.theone.entity.domain.Definition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefinitionRepository extends JpaRepository<Definition, String> {
}

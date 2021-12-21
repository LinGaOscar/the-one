package com.oscalin.generics.theone.repository;

import com.oscalin.generics.theone.domain.Definition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefinitionRepository extends JpaRepository<Definition, String> {
}

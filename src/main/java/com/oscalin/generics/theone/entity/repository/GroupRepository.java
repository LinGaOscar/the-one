package com.oscalin.generics.theone.entity.repository;

import com.oscalin.generics.theone.entity.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Long> {
}

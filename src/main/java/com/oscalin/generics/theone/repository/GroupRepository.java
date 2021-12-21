package com.oscalin.generics.theone.repository;

import com.oscalin.generics.theone.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Long> {
}

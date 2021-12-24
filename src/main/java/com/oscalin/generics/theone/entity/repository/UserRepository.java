package com.oscalin.generics.theone.entity.repository;

import com.oscalin.generics.theone.entity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {

     List<User> findByUserNameContains(String name);

}

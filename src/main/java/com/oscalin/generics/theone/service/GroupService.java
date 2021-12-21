package com.oscalin.generics.theone.service;

import com.oscalin.generics.theone.domain.Group;

import java.util.List;

public interface GroupService {
    Group saveGroup(Group group);
    Group updateGroup(Group group);
    Group findGroupById(Long id);
    List<Group> findAll();
    void deleteGroup(Long id);
}

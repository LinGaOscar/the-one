package com.oscalin.generics.theone.service;

import com.oscalin.generics.theone.entity.domain.Group;
import com.oscalin.generics.theone.entity.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    private GroupRepository groupRepository;

    @Autowired
    public void autoWired(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group updateGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group findGroupById(String id) {
        return groupRepository.findById(id).orElse(null);
    }

    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public void deleteGroup(String id) {
        groupRepository.deleteById(id);
    }
}

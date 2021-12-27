package com.oscalin.generics.theone;

import com.oscalin.generics.theone.entity.domain.Function;
import com.oscalin.generics.theone.entity.domain.Group;
import com.oscalin.generics.theone.entity.domain.User;
import com.oscalin.generics.theone.entity.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GroupTestJPA {

    private GroupRepository groupRepository;

    @Autowired
    public void autoWired(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Test
    public void add() {
        Group group = new Group();
        group.setGroupId("400");
        group.setGroupName("sa");
        group.setFunctions("sideBars,system_setting,task_setting,report_output,user_list,group_setting,task_chart,task_list");
        groupRepository.save(group);

    }

    @Test
    public void find() {

        Group group=groupRepository.findById("100").orElse(null);
        System.out.println(group);
    }

}

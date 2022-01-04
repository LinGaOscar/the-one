package com.oscalin.generics.theone;

import com.oscalin.generics.theone.entity.domain.Function;
import com.oscalin.generics.theone.entity.domain.Group;
import com.oscalin.generics.theone.entity.repository.FunctionRepository;
import com.oscalin.generics.theone.entity.repository.GroupRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GroupTestJPA {

    private GroupRepository groupRepository;

    private FunctionRepository functionRepository;

    @Autowired
    public void autoWired(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }


    @Autowired
    public void autoWired(FunctionRepository functionRepository) {
        this.functionRepository = functionRepository;
    }

    @Test
    public void add() {
        Group group = new Group();
        group.setGroupId("9999");
        group.setGroupName("admin");
        group.setFunctions("system_setting,task_setting,report_output,user_list,group_setting,task_chart,task_list");
        groupRepository.save(group);

    }

    @Test
    public void find() {

        Group group = groupRepository.findById("100").orElse(null);
        String functionList = group.getFunctions();
//        System.out.println(group);

        List<Function> functions = new ArrayList<>();
        ArrayList<String> menuLevel = new ArrayList<>();
        for (String retrieval : functionList.split(",")) {
            Map<String, Function> item = new HashMap<>();
            Function function = functionRepository.findById(retrieval).orElse(null);
            functions.add(function);
            menuLevel.add(function.getMenuLevel()+"level");
        }
        ArrayList<String> res= (ArrayList<String>) menuLevel.stream().distinct().collect(Collectors.toList());

        System.out.println(functions);
        System.out.println(res);
    }

}

package com.oscalin.generics.theone;

import com.oscalin.generics.theone.domain.*;
import com.oscalin.generics.theone.repository.*;
import org.hibernate.annotations.Columns;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Column;
import javax.persistence.Table;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JPATest {

    private DepartmentRepository departmentRepository;

    private UserRepository userRepository;

    private GroupRepository groupRepository;

    private DivisionRepository divisionRepository;

    private DefinitionRepository definitionRepository;

    private FunctionRepository functionRepository;

    @Autowired
    public void autoWired(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Autowired
    public void autoWired(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void autoWired(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Autowired
    public void autoWired(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    @Autowired
    public void autoWired(DefinitionRepository definitionRepository) {
        this.definitionRepository = definitionRepository;
    }

    @Autowired
    public void autoWired(FunctionRepository functionRepository) {
        this.functionRepository = functionRepository;
    }

    @Test
    public void add() {
//        Division division = new Division();
//        division.setDivisionId("D0570000");
//        division.setDivisionName("企業服務技術處");
//        divisionRepository.save(division);


        Department department = new Department();
//        department.setDepartmentId("D0530100");
//        department.setDepartmentName("ERP系統部");

        department.setDepartmentId("D0570100");
//        department.setDepartmentName("企業行動技術部");

//        department.setDepartmentId("D0520900");
//        department.setDepartmentName("企業網站技術部");

//        department.setDepartmentId("D0570300");
//        department.setDepartmentName("企業支援系統部");

//        department.setDivision(division);
//        departmentRepository.save(department);

        Function function=new Function();
        function.setFunctionId("task_chart");
        function.setFunctionName("報告圖表");
        function.setIsFolder("N");
        function.setUpLevel("report_output");
        function.setSortNo("1");
        functionRepository.save(function);

        Group group = new Group();
//        group.setGroupId(6);
//        group.setGroupName("boss");
//        group.setGroupFunctions("A,B,C,D");
//        groupRepository.save(group);

//        User user = new User();
//        user.setUserId("100");
//        user.setUserName("boss100");
//        user.setIsDelete("N");
//        user.setDepartment(department);
//        user.setGroup(group);
//        userRepository.save(user);

//        Definition definition = new Definition();
//        definition.setDefinitionId("100");
//        definition.setDefinition("圖表顯示");
//        definition.setTableName("group_list");
//        definition.setColumnName("");
//        definition.setColumnValue("");
//        definitionRepository.save(definition);
    }

    @Test
    public void find() {
        List<User> users = userRepository.findByUserNameContains("boss");
//        User user = userRepository.findById("1").orElse(null);
//        System.out.println(user);

        System.out.println("find");
        if (!users.isEmpty()) {
            for (User user : users) {
                System.out.println(user.getUserId());
                System.out.println(user.getUserName());
                System.out.println(user.getDepartment());
                System.out.println(user.getGroup());
                System.out.println(user.getIsDelete());
                System.out.println(user);

            }
        } else {
            System.out.println("empty");
        }
    }

    @Test
    public void check() {
        Table table = User.class.getAnnotation(Table.class);
        String tableName = table.name();

        System.out.println(tableName);

    }

}

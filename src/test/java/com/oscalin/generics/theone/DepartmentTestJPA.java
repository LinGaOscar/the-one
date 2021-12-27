package com.oscalin.generics.theone;

import com.oscalin.generics.theone.entity.domain.*;
import com.oscalin.generics.theone.entity.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DepartmentTestJPA {

    private DepartmentRepository departmentRepository;


    @Autowired
    public void autoWired(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Test
    public void add() {

        Department department = new Department();
        department.setDepartmentId("D0530100");
        department.setDepartmentName("ERP系統部");

//        department.setDepartmentId("D0570100");
//        department.setDepartmentName("企業行動技術部");

//        department.setDepartmentId("D0520900");
//        department.setDepartmentName("企業網站技術部");

//        department.setDepartmentId("D0570300");
//        department.setDepartmentName("企業支援系統部");

        Division division = new Division();
        division.setDivisionId("D0570000");
        department.setDivision(division);
        departmentRepository.save(department);

    }

    @Test
    public void find() {
        Department department = departmentRepository.findById("D0530100").orElse(null);
        System.out.println(department);
    }

}

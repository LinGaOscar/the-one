package com.oscalin.generics.theone;

import com.oscalin.generics.theone.entity.domain.Department;
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTestJPA {


    private UserRepository userRepository;



    @Autowired
    public void autoWired(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void add() {

        Department department = new Department();
        department.setDepartmentId("D0520900");

        Group group=new Group();
        group.setGroupId("6");

        User user = new User();
        user.setUserId("100");
        user.setUserName("boss100");
        user.setIsDelete("N");
        user.setDepartment(department);
        user.setGroup(group);
        userRepository.save(user);

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

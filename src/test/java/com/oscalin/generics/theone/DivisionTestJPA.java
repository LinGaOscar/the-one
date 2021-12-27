package com.oscalin.generics.theone;

import com.oscalin.generics.theone.entity.domain.Division;
import com.oscalin.generics.theone.entity.domain.User;
import com.oscalin.generics.theone.entity.repository.DivisionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DivisionTestJPA {

    private DivisionRepository divisionRepository;

    @Autowired
    public void autoWired(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    @Test
    public void add() {
        Division division = new Division();
        division.setDivisionId("D0570000");
        division.setDivisionName("企業服務技術處");
        divisionRepository.save(division);
    }

    @Test
    public void find() {
        Division division = divisionRepository.findById("D0570000").orElse(null);
        System.out.println(division);
    }

}

package com.oscalin.generics.theone.entity.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "department_list")
public class Department {

    @Id
    @Column(name = "id")
    private String departmentId;

    @Column(name = "name")
    private String departmentName;

    @ManyToOne
    private Division division;

}

package com.oscalin.generics.theone.entity.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_list")
public class User {
    @Id
    @Column(name = "id")
    private  String userId;

    @Column(name = "name")
    private String userName;

    @ManyToOne
    @OrderBy("departmentName")
    private Department department;

    @ManyToOne
    @OrderBy("groupName")
    private Group group;

    @Column(name = "is_delete")
    private String isDelete;

}

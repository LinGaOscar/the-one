package com.oscalin.generics.theone.entity.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "group_list")
public class Group {
    @Id
    @Column(name = "id")
    private String groupId;

    @Column(name = "name")
    private String groupName;

   @Column(name = "functions")
    private String functions;

}

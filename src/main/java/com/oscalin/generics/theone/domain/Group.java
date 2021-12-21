package com.oscalin.generics.theone.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "group_list")
public class Group {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long groupId;

    @Column(name = "name")
    private String groupName;

    @Column(name = "functions")
    private String groupFunctions;

}

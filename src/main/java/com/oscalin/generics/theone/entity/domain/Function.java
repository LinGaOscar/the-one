package com.oscalin.generics.theone.entity.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "function_list")
public class Function {

    @Id
    @Column(name = "id")
    private String functionId;

    @Column(name = "name")
    private String functionName;

    @Column(name = "is_folder")
    private String isFolder;

    @Column(name = "up_level")
    private  String upLevel;

    @Column(name = "sort_no")
    private String sortNo;
}

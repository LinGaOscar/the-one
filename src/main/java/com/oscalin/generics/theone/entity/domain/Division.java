package com.oscalin.generics.theone.entity.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "division_list")
public class Division {

    @Id
    @Column(name = "id")
    private String divisionId;

    @Column(name = "name")
    private String divisionName;

}

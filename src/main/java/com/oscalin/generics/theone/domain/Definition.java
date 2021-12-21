package com.oscalin.generics.theone.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "definition_list")
public class Definition {
    @Id
    @Column(name = "id")
    private String definitionId;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "column_name")
    private String columnName;

    @Column(name = "column_value")
    private String columnValue;

    private String definition;
}

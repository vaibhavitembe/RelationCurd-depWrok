package com.zplus.depwork.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "work")

public class WorkModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer workId;

    @Column
    private String name;

    @Column
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dep_id")
    private DepModel depModel;


}


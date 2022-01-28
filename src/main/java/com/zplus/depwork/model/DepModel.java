package com.zplus.depwork.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "dep")

public class DepModel {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)

         @Column
      private Integer  depId;

         @Column
     private String  name;

         @Column
     private String status;
         



}

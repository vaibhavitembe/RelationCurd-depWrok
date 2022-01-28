package com.zplus.depwork.dao;

import com.zplus.depwork.model.WorkModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface WorkDao extends CrudRepository<WorkModel,Integer> {

    List findByStatus(String active);

}
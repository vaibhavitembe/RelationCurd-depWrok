package com.zplus.depwork.dao;

import com.zplus.depwork.model.DepModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DepDao extends CrudRepository<DepModel,Integer> {


    List findByStatus(String active);
}

package com.zplus.depwork.service;

import com.zplus.depwork.dto.DepDto;

import java.util.List;

public interface DepService {
    Boolean insert(DepDto depDto);

    Boolean Update(DepDto depDto);

    List getAllDep();

    List activeDepDetails();

    Boolean deleteDepById(Integer depId);


 }

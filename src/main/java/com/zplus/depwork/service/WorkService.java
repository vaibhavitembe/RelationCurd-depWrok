package com.zplus.depwork.service;

import com.zplus.depwork.dto.WorkDto;

import java.util.List;

public interface WorkService {
    Boolean insert(WorkDto workDto);

    Boolean Update(WorkDto workDto);

    List getAllWork();

    List activeWorkDetails();

    Boolean deleteWorkById(Integer workId);


}

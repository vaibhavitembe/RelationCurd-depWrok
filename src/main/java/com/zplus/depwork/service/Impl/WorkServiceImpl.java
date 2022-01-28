package com.zplus.depwork.service.Impl;

import com.zplus.depwork.dao.WorkDao;
import com.zplus.depwork.dto.WorkDto;
import com.zplus.depwork.model.DepModel;
import com.zplus.depwork.model.WorkModel;
import com.zplus.depwork.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WorkServiceImpl  implements WorkService {

    @Autowired
    private WorkDao workDao;

    @Override
    public Boolean insert(WorkDto workDto) {

        WorkModel workModel = new WorkModel();

        workModel.setName(workDto.getName());
        workModel.setStatus(workDto.getStatus());

         try {
             DepModel depModel=new DepModel();
            depModel.setDepId(workDto.getDepId());
            workModel.setDepModel(depModel);
            workDao.save(workModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public Boolean Update(WorkDto workDto) {


        WorkModel  workModel = new WorkModel();

        workModel.setWorkId(workDto.getWorkId());
        workModel.setName(workDto.getName());
        workModel.setStatus(workDto.getStatus());
        try {
            DepModel depModel=new DepModel();
            depModel.setDepId(workDto.getDepId());
            workModel.setDepModel(depModel);

            workDao.save(workModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List getAllWork() {

        {
            return (List) workDao.findAll();
        }
    }


    @Override
    public List activeWorkDetails() {
        return workDao.findByStatus("Active");
    }

    @Override
    public Boolean deleteWorkById(Integer workId) {
        try {
            workDao.delete(workId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



    }



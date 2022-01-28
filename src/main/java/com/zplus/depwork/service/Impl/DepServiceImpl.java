package com.zplus.depwork.service.Impl;

import com.zplus.depwork.dao.DepDao;
import com.zplus.depwork.dto.DepDto;
import com.zplus.depwork.model.DepModel;
import com.zplus.depwork.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepServiceImpl implements DepService {

    @Autowired
    private DepDao depDao;

    @Override
    public Boolean insert(DepDto depDto) {

        DepModel depModel = new DepModel();

        depModel.setName(depDto.getName());
        depModel.setStatus(depDto.getStatus());
        try {
            depDao.save(depModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public Boolean Update(DepDto depDto) {


        DepModel depModel = new DepModel();

        depModel.setDepId(depDto.getDepId());
        depModel.setName(depDto.getName());
        depModel.setStatus(depDto.getStatus());
        try {
            depDao.save(depModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List getAllDep() {

        {
            return (List) depDao.findAll();
        }
    }


    @Override
    public List activeDepDetails() {
        return depDao.findByStatus("Active");
    }

    @Override
    public Boolean deleteDepById(Integer depId) {
        try {
            depDao.delete(depId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
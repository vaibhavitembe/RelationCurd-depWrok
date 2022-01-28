package com.zplus.depwork.controller;

import com.zplus.depwork.dto.WorkDto;
import com.zplus.depwork.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin("*")
@RequestMapping(value = "work")

public class WorkController {



    @Autowired
    private WorkService workService;

    @PostMapping
    private ResponseEntity insert(@RequestBody WorkDto workDto) {
        Boolean flag = workService.insert(workDto);
        return new ResponseEntity(flag, HttpStatus.OK);
    }

    @PutMapping
    private ResponseEntity Update(@RequestBody WorkDto workDto){
        Boolean flag =workService.Update(workDto);
        return new ResponseEntity(flag,HttpStatus.OK);

    }
    @GetMapping
    private ResponseEntity getAllWork() {

        List list = workService.getAllWork();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping(value="activeWorkDetails")
    private ResponseEntity activeWorkDetails()
    {
        List list=workService.activeWorkDetails();
        return new ResponseEntity(list,HttpStatus.OK);

    }

    @DeleteMapping("/deleteByworkId/{workId}")
    private ResponseEntity deleteworkById(@PathVariable Integer workId)
    {
        Boolean flag=workService.deleteWorkById(workId);
        return  new ResponseEntity(flag,HttpStatus.OK);

    }




}
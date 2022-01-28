package com.zplus.depwork.controller;


import com.zplus.depwork.dto.DepDto;
import com.zplus.depwork.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "dep")

public class DepController {

        @Autowired
        private DepService depService;

    @PostMapping
    private ResponseEntity insert(@RequestBody DepDto depDto) {
        Boolean flag = depService.insert(depDto);
        return new ResponseEntity(flag, HttpStatus.OK);
    }

        @PutMapping
        private ResponseEntity Update(@RequestBody DepDto depDto){
            Boolean flag =depService.Update(depDto);
            return new ResponseEntity(flag,HttpStatus.OK);

        }
        @GetMapping
        private ResponseEntity getAllDep() {

            List list = depService.getAllDep();
            return new ResponseEntity(list, HttpStatus.OK);
        }
        @GetMapping(value="activeDepDetails")
        private ResponseEntity activeDepDetails()
        {
            List list=depService.activeDepDetails();
            return new ResponseEntity(list,HttpStatus.OK);

        }

        @DeleteMapping("/deleteBydepId/{depId}")
        private ResponseEntity deleteDepById(@PathVariable Integer depId)
        {
            Boolean flag=depService.deleteDepById(depId);
            return  new ResponseEntity(flag,HttpStatus.OK);

        }



    }













package com.example.demo.controller;

import com.example.demo.entity.FitnessType;
import com.example.demo.service.FitnessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/FitnessType")
public class FitnessTypeController {
    @Autowired
    FitnessTypeService fitnessTypeService;
//    增删改减，没错
    @RequestMapping(value = "/insert")
    public int insert(String fitnesstypeid, String name) {
        FitnessType fitnessType = new FitnessType(fitnesstypeid, name);
        return fitnessTypeService.insert(fitnessType);
    }


    @RequestMapping(value = "/show")
    public List<FitnessType> show() {
        return fitnessTypeService.selectAll();
    }

    @RequestMapping(value = "/selectById")
    public FitnessType selectById(String fitnesstypeid) {
        return fitnessTypeService.selectByPrimaryKey(fitnesstypeid);
    }

    @RequestMapping(value = "/update")
    public int update(String firnesstypeid,String name) {
        FitnessType fitnessType = new FitnessType(firnesstypeid, name);
        return fitnessTypeService.updateByPrimaryKey(fitnessType);
    }

    @RequestMapping(value = "/delete")
    public int delete(String fitnesstypeid) {
        return fitnessTypeService.deleteByPrimaryKey(fitnesstypeid);
    }

}

package com.anthotel.admin.controller;

import com.anthotel.admin.entity.FitnessType;
import com.anthotel.admin.response.AjaxResult;
import com.anthotel.admin.response.ResponseTool;
import com.anthotel.admin.service.FitnessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FitnessTypeController {
    @Autowired
    FitnessTypeService fitnessTypeService;
//    增删改减，没错
    @RequestMapping(value = "/op/fitnessType/insert")
    public AjaxResult insert(String fitnesstypeid, String name) {
        FitnessType fitnessType = new FitnessType(fitnesstypeid, name);
        int result = fitnessTypeService.insert(fitnessType);
        if (result == 1) {
            return ResponseTool.success(fitnessType);
        } else {
            return ResponseTool.failed("添加健身方式失败");
        }
    }


    @RequestMapping(value = "/op/fitnessType/show")
    public AjaxResult show() {
        List<FitnessType> list = fitnessTypeService.selectAll();
        if (list !=null) {
            return ResponseTool.success(list);
        } else {
            return ResponseTool.failed("当前没有健身方式");
        }
    }

    @RequestMapping(value = "/op/fitnessType/selectById")
    public AjaxResult selectById(String fitnesstypeid) {
        FitnessType fitnessType = fitnessTypeService.selectByPrimaryKey(fitnesstypeid);
        if (fitnessType !=null) {
            return ResponseTool.success(fitnessType);
        } else {
            return ResponseTool.failed("找不到指定的健身方式");
        }
    }

    @RequestMapping(value = "/op/fitnessType/update")
    public AjaxResult update(String firnesstypeid,String name) {
        FitnessType fitnessType = new FitnessType(firnesstypeid, name);
        int result = fitnessTypeService.updateByPrimaryKey(fitnessType);
        if (result == 1) {
            return ResponseTool.success(fitnessType);
        } else {
            return ResponseTool.failed("更新失败");
        }
    }

    @RequestMapping(value = "/op/fitnessType/delete")
    public AjaxResult delete(String fitnesstypeid) {

        int result = fitnessTypeService.deleteByPrimaryKey(fitnesstypeid);
        if (result == 1) {
            return ResponseTool.success("删除成功");
        } else {
            return ResponseTool.failed("删除失败");
        }
    }

}

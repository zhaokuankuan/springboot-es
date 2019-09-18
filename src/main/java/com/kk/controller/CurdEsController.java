package com.kk.controller;

import com.kk.domain.Person;
import com.kk.service.CurdEsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * es的增删改查操作
 * @author :Mr.kk
 * @date: 2019/9/18 16:26
 */
@Api(description = "es的增删改查操作")
@RestController
@RequestMapping("/es")
public class CurdEsController {

    @Autowired
    private CurdEsService curdEsService;

    @PostMapping("/insert")
    @ApiOperation(value = "新增",notes = "新增")
    public Object insert(@RequestBody Person person){
        return curdEsService.insert(person);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除",notes = "删除")
    public void delete(@RequestBody Person person){
        curdEsService.delete(person);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改",notes = "修改")
    public Object update(@RequestBody Person person){
        return curdEsService.update(person);
    }

    @GetMapping("/findById")
    @ApiOperation(value = "根据id查询",notes = "根据id查询")
    public Object findById(Integer id){
        return curdEsService.findById(id);
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "全部查询",notes = "全部查询")
    public Object findAll(){
        return curdEsService.findAll();
    }

}

package com.shribak.task2.controllers;

import com.shribak.task2.controllers.models.RequestInfo;
import com.shribak.task2.dao.ShapeRepository;
import com.shribak.task2.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api")
public class MainController {
    @Autowired
    private ShapeRepository shapeRepository;

    @RequestMapping(value="shape/add", method = RequestMethod.GET)
    public void add(@RequestBody Shape shape) {
        shapeRepository.save(shape);
    }

    @RequestMapping(value="shape/edit")
    public void edit(@RequestBody RequestInfo info) {
        shapeRepository.edit(info);
    }

    @RequestMapping(value="shape/get")
    @ResponseBody
    public Shape get(@RequestBody RequestInfo info) {
        return shapeRepository.get(info);
    }

    @RequestMapping(value="shape/delete")
    public void delete(@RequestBody Shape shape) {
          shapeRepository.delete(shape);
    }
}

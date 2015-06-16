package com.shribak.task2.dao;

import com.shribak.task2.controllers.models.RequestInfo;
import com.shribak.task2.models.Shape;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShapeRepository {
    List<Shape> shapes = new ArrayList<Shape>();

    public void save(Shape shape) {
        shapes.add(shape);
    }

    public void edit(RequestInfo info) {
        //finding and editing required shape in repository
    }

    public Shape get(RequestInfo info) {
        //finding required shape in repository
        return null;
    }

    public void delete(Shape shape) {
        shapes.remove(shape);
    }
}

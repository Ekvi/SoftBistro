package com.shribak.task2.controllers.models;


import com.shribak.task2.models.Shape;

import java.util.ArrayList;
import java.util.List;

public class ListShapes {
    private List<Shape> shapes = new ArrayList<Shape>();

    public ListShapes() {}

    public ListShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
}

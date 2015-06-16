package com.shribak.task2.controllers;

import com.shribak.task2.controllers.models.ListShapes;
import com.shribak.task2.controllers.models.ListSquares;
import com.shribak.task2.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller()
@RequestMapping("api")
public class CalculateSquareController {

    @RequestMapping(value="shape/calculate")
    @ResponseBody
    public ListSquares calculateSquare(@RequestBody ListShapes listShapes) {

        List<Shape> shapes = listShapes.getShapes();
        List<Double> squares = new ArrayList<Double>();

        for(Shape s : shapes) {
            squares.add(s.getArea());
        }

        ListSquares listSquares = new ListSquares();
        listSquares.setSquares(squares);

        return listSquares;
    }
}

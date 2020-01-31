package com.example.interviewpreparation.design_pattern;

import java.util.HashMap;

interface Shape1 {
    void draw();

    void color();
}

class Triangle1 implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle Drawn");
    }

    @Override
    public void color() {
        System.out.println("Triangle colored");
    }
}

class Circle1 implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Drawn");
    }

    @Override
    public void color() {
        System.out.println("Circle colored");
    }
}

class FlyWeightFactory {
    private HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public Shape getShapeObject(ShapeType shapeType) {
        if (!shapes.containsKey(shapeType)) {
            if (shapeType == ShapeType.CIRCLE) {
                shapes.put(shapeType, new Circle());
            } else {
                shapes.put(shapeType, new Triangle());
            }
        }
        return shapes.get(shapeType);
    }
}

enum ShapeType {
    CIRCLE, TRIANGLE
}

public class FlyWeightDesignPattern {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        Shape circle = flyWeightFactory.getShapeObject(ShapeType.CIRCLE);
        Shape triangle = flyWeightFactory.getShapeObject(ShapeType.TRIANGLE);
        Shape circle1 = flyWeightFactory.getShapeObject(ShapeType.CIRCLE);

        circle.color();
        circle.draw();

        triangle.color();
        triangle.draw();
    }
}

package com.example.interviewpreparation.design_pattern;

import java.util.ArrayList;

interface Shape {
    public void draw();

    public void color();
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle Drawn");
    }

    @Override
    public void color() {
        System.out.println("Triangle colored");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Drawn");
    }

    @Override
    public void color() {
        System.out.println("Circle colored");
    }
}

public class CompositDesignPattern {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Circle());

        for (Shape shape : shapes) {
            shape.draw();
            shape.color();
        }
    }
}

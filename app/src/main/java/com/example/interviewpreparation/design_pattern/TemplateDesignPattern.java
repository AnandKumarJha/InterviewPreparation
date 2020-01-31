package com.example.interviewpreparation.design_pattern;

abstract class TemplateForHouse {
    public final void buildHouse() {
        createConcrete();
        addBricks();
        addWindow();
        paintHouse();
    }

    public void createConcrete() {
        System.out.println("createConcrete");
    }

    public void addBricks() {
        System.out.println("addBricks");
    }

    abstract public void addWindow();
    abstract public void paintHouse();
}

class SimpleHouse extends TemplateForHouse{

    @Override
    public void addWindow() {
        System.out.println("SimpleHouse : addWindow");
    }

    @Override
    public void paintHouse() {
        System.out.println("SimpleHouse : paintHouse");
    }
}

class FancyHouse extends TemplateForHouse{

    @Override
    public void addWindow() {
        System.out.println("FancyHouse : addWindow");
    }

    @Override
    public void paintHouse() {
        System.out.println("FancyHouse : paintHouse");
    }
}

public class TemplateDesignPattern {
    public static void main(String args[]) {
        new SimpleHouse().buildHouse();
        new FancyHouse().buildHouse();
    }
}

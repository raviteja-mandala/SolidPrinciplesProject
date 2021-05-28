package com.zemoso.concreteShapes;

import com.zemoso.shapes.Shape_2D;

public class Rectangle implements Shape_2D {
    public Integer length;
    public Integer breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public int getArea() {
        return length*breadth;
    }
}

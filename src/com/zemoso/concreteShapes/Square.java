package com.zemoso.concreteShapes;

import com.zemoso.shapes.Shape_2D;

public class Square implements Shape_2D {
    public Integer length;
    public Square(int length){
        this.length=length;
    }
    public int getArea(){
        return length*length;
    }
}

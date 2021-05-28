package com.zemoso.concreteShapes;

import com.zemoso.shapes.Shape;
import com.zemoso.shapes.Shape_2D;
import com.zemoso.shapes.Shape_3D;

public class CalcAreaWithSolid {
    public Shape[] shapes;
    public CalcAreaWithSolid(Shape[] shapes){
        this.shapes=shapes;
    }
    public int calculateTotalArea(){
        int totalArea=0;
        for(Shape shape : shapes){
            if(shape instanceof Shape_2D){
                totalArea+=((Shape_2D) shape).getArea();
            }
        }
        return totalArea;
    }

    public int calculateTotalVolume(){
        int totalVolume=0;
        for(Shape shape : shapes){
            if(shape instanceof Shape_3D){
                totalVolume+=((Shape_3D) shape).getVolume();
            }
        }
        return totalVolume;
    }
}

package com.zemoso.concreteShapes;

import com.zemoso.shapes.ShapeSolidViolated;

public class CalcAreaWithoutSolid {
    public ShapeSolidViolated[] shapes;
    public CalcAreaWithoutSolid(ShapeSolidViolated[] shapes){
        this.shapes=shapes;
    }

    public int getArea() {
        int totalArea=0;
        for(ShapeSolidViolated sv : shapes){
            if(sv.getShapeType().equalsIgnoreCase("Rectangle")){
                totalArea=totalArea+sv.getLength()*sv.getBreadth();
            }
            if(sv.getShapeType().equalsIgnoreCase("Square")){
                totalArea=totalArea+sv.getLength()*sv.getLength();
            }
        }
        return totalArea;
    }
}

package com.zemoso.executables;

import com.zemoso.concreteShapes.CalcAreaWithoutSolid;
import com.zemoso.shapes.ShapeSolidViolated;

public class WithoutSolidPrinciples {
    public static void main(String[] args) {
        ShapeSolidViolated rectangle = new ShapeSolidViolated(2, 3, 4);
        ShapeSolidViolated square = new ShapeSolidViolated(5, 0, 0);
        ShapeSolidViolated[] svarray = {rectangle, square};
        CalcAreaWithoutSolid ac = new CalcAreaWithoutSolid(svarray);
        System.out.println(ac.getArea());
    }

}

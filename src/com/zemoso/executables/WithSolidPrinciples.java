package com.zemoso.executables;

import com.zemoso.concreteShapes.CalcAreaWithSolid;
import com.zemoso.concreteShapes.Cuboid;
import com.zemoso.concreteShapes.Rectangle;
import com.zemoso.concreteShapes.Square;
import com.zemoso.shapes.Shape;

public class WithSolidPrinciples {
    public static void main(String[] args){
        Shape[] shapes={new Rectangle(2,3), new Square(4), new Cuboid(1,5,7)};
        CalcAreaWithSolid cav=new CalcAreaWithSolid(shapes);
        System.out.println("total area is "+cav.calculateTotalArea());
        System.out.println("total volume is "+cav.calculateTotalVolume());

        //Liskov substitution principle violated.
       /* Cuboid cbd=new Cuboid(2,4,6);
        System.out.println(cbd.getVolume());
        Cube cbe=new Cube(3);
        cbd=cbe;
        System.out.println(cbd.getVolume());*/

    }
}

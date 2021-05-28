package com.zemoso.concreteShapes;

import com.zemoso.shapes.Shape_2D;
import com.zemoso.shapes.Shape_3D;

public class Cuboid implements Shape_2D, Shape_3D {
    public int length;
    public int breadth;
    public int height;

    public Cuboid(int length){

        this.length=length;
    }
    public Cuboid(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    @Override
    public int getArea() {
        return 2*(length*breadth+breadth*height+length*height);
    }

    public int getVolume(){
        return length*breadth*height;
    }
}

package com.zemoso.shapes;

public  class ShapeSolidViolated {
    public Integer length;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public void setBreadth(Integer breadth) {
        this.breadth = breadth;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public Integer breadth;
    public Integer height;
    public String shapeType;
    public ShapeSolidViolated(int length, int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
}

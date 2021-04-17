/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que6;

/**
 *
 * @author S541994
 */
class Triangle extends GeometricObject {

    double side1, side2, side3;
    String color;
    boolean n1;

    public Triangle(double side1, double side2, double side, String color, boolean n1) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.n1 = n1;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isN1() {
        return n1;
    }

    public void setN1(boolean n1) {
        this.n1 = n1;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override

    public double gettrArea() {
        double side = (side1 + side2 + side3) / 2;
        return side;
    }

    @Override
    public double gettrPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + color + ", n1=" + n1 + '}';
    }

}

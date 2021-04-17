/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que3;

/**
 *
 * @author S541994
 */
public class Circle {

    int prop1;
    int prop2;
    int prop3;
    int prop4;
    int prop5;

    //this is constructor 
    public Circle(int prop1, int prop2, int prop3, int prop4, int prop5) {
        super();
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
        this.prop4 = prop4;
        this.prop5 = prop5;
    }

    @Override
    public String toString() {
        return "Circle [prop1=" + prop1 + ", prop2=" + prop2 + ", prop3=" + prop3 + ", prop4=" + prop4 + ", prop5="
                + prop5 + "]";
    }

}

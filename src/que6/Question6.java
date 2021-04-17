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
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle t=new Triangle(8, 6, 30, "Red", true);
        System.out.println("Area: "+t.gettrArea());
        System.out.println("perimeter: "+t.gettrPerimeter());
    }
    
}

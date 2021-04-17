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
import java.util.ArrayList;
import java.util.Date;

public class Question3 {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Loan(123456, "BoFA", "Nikitha1"));
        list.add(new Date());
        list.add("question3");
        list.add(new Circle(1, 2, 3, 4, 5));

        for (Object ob : list) {
            System.out.println(ob.toString());
        }

    }

}

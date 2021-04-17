/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que1;

/**
 *
 * @author S541994
 */
import java.util.ArrayList;
import java.util.Scanner;

class RemoveDuplicate {

    public ArrayList<Integer> removeDuplicate(ArrayList<Integer> oldlist) {

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (Integer i : oldlist) {

            if (!newList.contains(i)) {

                newList.add(i);
            }
        }

        return newList;
    }
}

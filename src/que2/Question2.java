/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que2;

/**
 *
 * @author S541994
 */
import java.util.Arrays;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        System.out.print("Enter list 1: ");
        int array1[][] = new int[3][3];
        int array2[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter list 2: ");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        sc.close();

        boolean check = true;
        for (int i = 0; check && i < array1.length; ++i) {

            check = Arrays.equals(array1[i], array2[i]);

            if (!check) {
                break;
            }
        }
        if (check) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }
}

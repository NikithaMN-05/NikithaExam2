/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S541994
 */
public class RemoveDuplicateDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	
    	RemoveDuplicate rd = new RemoveDuplicate();
    
    	ArrayList<Integer> oldList = new ArrayList<Integer>();
    	
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Enter ten integers:");
        
        for(int j=0;j<=10;j++){
        	int n=sc.nextInt();
        	oldList.add(n);
        }
        
        sc.close();
        
        ArrayList<Integer>  newList = rd.removeDuplicate(oldList);
        
        System.out.println("The distinct integers are "+ newList);
    }
            
    }


  

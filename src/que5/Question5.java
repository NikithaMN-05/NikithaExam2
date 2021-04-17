/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que5;

import java.util.Date;

/**
 *
 * @author S541994
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
		Person p = new Person("Nikitha","USA", "nikitha@gmail.com", 1234567896);
		Student s = new Student("Nikitha2","Austraila", "nikitha2@gmail.com", 6632563, "A","Status");
		Employee e = new Employee("Nikitha3","Canada", "nikitha3@gmail.com", 78965413,"IBM", 5000,new Date());
		Faculty f = new Faculty("Nikitha4","France", "nikitha4@gmail.com", 563256,"Oracle", 60000,new Date(), "9.30 AM - 6.30 PM", 5);
		Staff sf = new Staff("Nikitha4","France", "nikitha4@gmail.com", 563256,"Oracle", 60000,new Date(), "HOD");
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(e);
		System.out.println(f);
		System.out.println(sf);
		
	}

}

    

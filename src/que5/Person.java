/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que5;

/**
 *
 * @author S541994
 */
import java.util.Date;

class Person {

    private String name, address, emailaddress;
    private int phonenumber;

    public Person(String name, String address, String emailaddress, int phonenumber) {
        super();
        this.name = name;
        this.address = address;
        this.emailaddress = emailaddress;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", emailaddress=" + emailaddress + ", phonenumber="
                + phonenumber + "]";
    }

}

class Student extends Person {

    String grade;
    private final String status;

    public Student(String name, String address, String emailaddress, int phonenumber, String grade, String status) {
        super(name, address, emailaddress, phonenumber);
        this.grade = grade;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student [grade=" + grade + ", status=" + status + "]";
    }

}

class Employee extends Person {

    private String office;
    private double salary;
    private Date datehired;

    public Employee(String name, String address, String emailaddress, int phonenumber, String office, double salary,
            Date datehired) {
        super(name, address, emailaddress, phonenumber);
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }

    @Override
    public String toString() {
        return "Employee [office=" + office + ", salary=" + salary + ", datehired=" + datehired + "]";
    }

}

class Faculty extends Employee {

    String officehours;
    int numberofteachingsubjects;

    public Faculty(String name, String address, String emailaddress, int phonenumber, String office, double salary,
            Date datehired, String officehours, int numberofteachingsubjects) {
        super(name, address, emailaddress, phonenumber, office, salary, datehired);
        this.officehours = officehours;
        this.numberofteachingsubjects = numberofteachingsubjects;
    }

    @Override
    public String toString() {
        return "Faculty [officehours=" + officehours + ", numberofteachingsubjects=" + numberofteachingsubjects + "]";
    }

}

class Staff extends Employee {

    String staffmember;

    public Staff(String name, String address, String emailaddress, int phonenumber, String office, double salary,
            Date datehired, String staffmember) {
        super(name, address, emailaddress, phonenumber, office, salary, datehired);
        this.staffmember = staffmember;
    }

    @Override
    public String toString() {
        return "Staff [staffmember=" + staffmember + "]";
    }

}

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
public class Loan {

    float amount;
    String bankname;
    String personname;

    //this is constructor 
    public Loan(float amount, String bankname, String personname) {
        super();
        this.amount = amount;
        this.bankname = bankname;
        this.personname = personname;
    }

    @Override
    public String toString() {
        return "Loan [amount=" + amount + ", bankname=" + bankname + ", personname=" + personname + "]";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que4;

/**
 *
 * @author S541994
 */
class Parents {

    String mothername;
    String fathername;

    public Parents(String mothername, String fathername)
    {
        this.mothername = mothername;
        this.fathername = fathername;
    }

    @Override
    public String toString() {
        return "Parents [mothername=" + mothername + ", fathername=" + fathername + "]";
    }

}

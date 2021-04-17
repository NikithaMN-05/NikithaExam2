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
class Children extends Parents
{
	
	String children1name;
	String children2name;
	
	public Children(String mothername, String fathername, String children1name, String children2name) {
		
		super(mothername, fathername);
		this.children1name = children1name;
		this.children2name = children2name;
	}

	@Override
	public String toString() {
		super.toString();
		return "Children [children1name=" + children1name + ", children2name=" + children2name + "]";
	}
	
	
}
    


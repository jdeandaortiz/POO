/**
 * 
 */
package mx.edu.utng.asociaciones;

import java.util.List;

/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer una cuenta
 */
public class Account {
	private String name;
	private String emailAddress;
	private List<AddressBook> lstAccessBy;
	
	public Account( List<AddressBook> lstAccessBy){
		this.lstAccessBy = lstAccessBy;
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	

}


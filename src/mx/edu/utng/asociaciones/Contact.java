/**
 * 
 */
package mx.edu.utng.asociaciones;


/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer un Contacto
 */
public class Contact {
	private String name;
	private String primaryContactMethod;
	private String emailAddress;
	private String faxNumber;
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
	 * @return the primaryContactMethod
	 */
	public String getPrimaryContactMethod() {
		return primaryContactMethod;
	}
	/**
	 * @param primaryContactMethod the primaryContactMethod to set
	 */
	public void setPrimaryContactMethod(String primaryContactMethod) {
		this.primaryContactMethod = primaryContactMethod;
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
	/**
	 * @return the faxNumber
	 */
	public String getFaxNumber() {
		return faxNumber;
	}
	/**
	 * @param faxNumber the faxNumber to set
	 */
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	

}

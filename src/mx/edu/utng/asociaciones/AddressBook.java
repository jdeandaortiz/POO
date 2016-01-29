package mx.edu.utng.asociaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer una Libro de direcciones
 */
public class AddressBook {
	private String name;
	private List<Contact> contacts;
	private List<ContactGroup> contactGroups;
	
	public AddressBook() {
		// TODO Auto-generated constructor stub
		this.contacts = new ArrayList<Contact>();
		this.contactGroups = new ArrayList<ContactGroup>();
		
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
	

}

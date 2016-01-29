/**
 * 
 */
package mx.edu.utng.asociaciones;

import java.util.List;


/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer un grupo de contactos
 */
public class ContactGroup {
	private String name;
	
	private List<ContactGroup> contactGroups;
	private List<Contact> contacts;
	
	public ContactGroup( List<ContactGroup> contactGroups,
		List<Contact> contacts)
		{
		// TODO Auto-generated constructor stub
		this.contactGroups = contactGroups;
		this.contacts = contacts;
		
	}

}

package mx.edu.utng.asociaciones_clase;
/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer un Destinatario
 */
public class Destinatario extends Persona{
	
	private String correo;
	private String apodoDestinatario;
	
	public Destinatario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the apodoDestinatario
	 */
	public String getApodoDestinatario() {
		return apodoDestinatario;
	}

	/**
	 * @param apodoDestinatario the apodoDestinatario to set
	 */
	public void setApodoDestinatario(String apodoDestinatario) {
		this.apodoDestinatario = apodoDestinatario;
	}
	
	

}

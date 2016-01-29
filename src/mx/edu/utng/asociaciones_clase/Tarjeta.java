package mx.edu.utng.asociaciones_clase;

import java.util.List;

import mx.edu.utng.asociaciones.ContactGroup;
/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer una Tarjeta
 */
public class Tarjeta {
	private String tipo;
	
	private int nroDestinatario;
	private List<Remitente> remitentes;
	private List<Destinatario> destinatarios;
	Dedicatoria []dedicatorias = new Dedicatoria[1];
	
	public Tarjeta( List<Remitente> remitentes, List<Destinatario> destinatarios){
		this.remitentes = remitentes;
		this.destinatarios = destinatarios;
	
		// TODO Auto-generated constructor stub
	}
	
	
	public void adicionarRemitente (Remitente remitente){
		
	}
	
public void adicionarDestinatario (Destinatario destinatario){
		
	}

/**
 * @return the tipo
 */
public String getTipo() {
	return tipo;
}

/**
 * @param tipo the tipo to set
 */
public void setTipo(String tipo) {
	this.tipo = tipo;
}

/**

/**
 * @return the infoDestinatario
 */
public int getNroDestinatario() {
	return nroDestinatario;
}
/**
 * @param infoDestinatario the infoDestinatario to set
 */
public void setNroDestinatario(int nroDestinatario) {
	this.nroDestinatario = nroDestinatario;
}
	
}

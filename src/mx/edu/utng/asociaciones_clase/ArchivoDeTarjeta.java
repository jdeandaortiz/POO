package mx.edu.utng.asociaciones_clase;

import java.util.List;

/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer un Archivo De Tarjeta
 */
public class ArchivoDeTarjeta {
	private String nombre;
	private List<TarjetaAnimada> asociadas;
	Tarjeta[] tarjetas = new Tarjeta[1];

	public ArchivoDeTarjeta(List<TarjetaAnimada> asociadas) {
		this.asociadas = asociadas;
		// TODO Auto-generated constructor stub
	}

	public void adicionar(Tarjeta tarjeta) {

	}

	public void modificar(Tarjeta tarjeta) {

	}

	public void eliminar(Tarjeta codigo) {

	}

	public void getDatos() {

	}

	public void nroRegistros() {

	}

	/**
	 * @return name
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *       
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the asociadas
	 */
	public List<TarjetaAnimada> getAsociadas() {
		return asociadas;
	}

	/**
	 * @param asociadas
	 *         
	 */
	public void setAsociadas(List<TarjetaAnimada> asociadas) {
		this.asociadas = asociadas;
	}

}

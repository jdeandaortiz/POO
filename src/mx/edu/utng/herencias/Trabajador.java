package mx.edu.utng.herencias;
/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer un Trabajador
 */
public class Trabajador extends Persona {
	private String compania;
	private long salario;
	 public Trabajador() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}
	/**
	 * @param compania the compania to set
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}
	/**
	 * @return the salario
	 */
	public long getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(long salario) {
		this.salario = salario;
	}
	 

}

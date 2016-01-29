/**
 * 
 */
package mx.edu.utng.herencias;

/**
 * @author Jesús Deanda Ortiz
 * @description Clase para establecer un Estudiante
 */
public class Estudiante extends Persona{
	private String universidad;
	private String carrera;
public Estudiante() {
	// TODO Auto-generated constructor stub
}
/**
 * @return the universidad
 */
public String getUniversidad() {
	return universidad;
}
/**
 * @param universidad the universidad to set
 */
public void setUniversidad(String universidad) {
	this.universidad = universidad;
}
/**
 * @return the carrera
 */
public String getCarrera() {
	return carrera;
}
/**
 * @param carrera the carrera to set
 */
public void setCarrera(String carrera) {
	this.carrera = carrera;
}

}

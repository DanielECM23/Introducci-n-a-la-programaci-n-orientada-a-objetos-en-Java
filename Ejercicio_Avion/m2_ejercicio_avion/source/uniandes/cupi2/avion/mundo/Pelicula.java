package uniandes.cupi2.avion.mundo;

public class Pelicula {
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Nombre de la película
	 */
	private String nombre;

	/**
	 * Género de la película
	 */
	private String genero;

	/**
	 * Duración de la película en minutos
	 */
	private int duracion;

	/**
	 * Nombre del director de la película
	 */
	private String director;
	
	
	/**
	 * Crea una nueva película con los datos dados.
	 * @param pNombre Nombre de la película.
	 * @param pGenero Género de la película.
	 * @param pDuracion Duración en minutos.
	 * @param pDirector Director de la película.
	 */
	public Pelicula(String Nombre, String Genero, int Duracion, String Director) {
	    nombre = Nombre;
	    genero = Genero;
	    duracion = Duracion;
	    director = Director;
	}
	


	/**
	 * Retorna el nombre de la película.
	 * @return Nombre de la película.
	 */
	public String darNombre() {
	    return nombre;
	}

	/**
	 * Retorna el género de la película.
	 * @return Género de la película.
	 */
	public String darGenero() {
	    return genero;
	}

	/**
	 * Retorna la duración de la película.
	 * @return Duración en minutos.
	 */
	public int darDuracion() {
	    return duracion;
	}

	/**
	 * Retorna el director de la película.
	 * @return Nombre del director.
	 */
	public String darDirector() {
	    return director;
	}
	
	/**
	 * Cambia el nombre de la película.
	 * @param pNombre Nuevo nombre.
	 */
	public void cambiarNombre(String pNombre) {
	    nombre = pNombre;
	}

	/**
	 * Cambia el género de la película.
	 * @param pGenero Nuevo género.
	 */
	public void cambiarGenero(String pGenero) {
	    genero = pGenero;
	}

	/**
	 * Cambia la duración de la película.
	 * @param pDuracion Nueva duración.
	 */
	public void cambiarDuracion(int pDuracion) {
	    duracion = pDuracion;
	}

	/**
	 * Cambia el director de la película.
	 * @param pDirector Nuevo director.
	 */
	public void cambiarDirector(String pDirector) {
	    director = pDirector;
	}
	/**
	 * Retorna una cadena de texto con la información de la película
	 * siguiendo el formato: <nombre> (<genero>). <duracion> minutos - director.
	 * @return Información de la película como cadena de texto.
	 */
	public String toString() {
	    return nombre + " (" + genero + "). " + duracion + " minutos - " + director + ".";
	}

}

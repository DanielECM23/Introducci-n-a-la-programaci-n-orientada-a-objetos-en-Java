package uniandes.cupi2.exposicionCanina.mundo;

public class Perro
{
    // Atributos

    private String nombre;
    private String raza;
    private String imagen;
    private int puntos;
    private int edad;

    // Constructores

    public Perro( String nombreP, String razaP, String imagenP, int puntosP, int edadP )
    {
        nombre = nombreP;
        raza = razaP;
        imagen = imagenP;
        puntos = puntosP;
        edad = edadP;

        verificarInvariante( );
    }

    // M�todos

    public String darNombre( )
    {
        return nombre;
    }

    public String darRaza( )
    {
        return raza;
    }

    public String darImagen( )
    {
        return imagen;
    }

    public int darPuntos( )
    {
        return puntos;
    }

    public int darEdad( )
    {
        return edad;
    }

    public int compararPorNombre( Perro p )
    {
    	int valorComparacion = nombre.compareToIgnoreCase( p.nombre );
    	if(valorComparacion < 0){
    		valorComparacion = -1;
    	}else if(valorComparacion == 0){
    		valorComparacion = 0;
    	}else{
    		valorComparacion = 1;
    	}
        return valorComparacion;
    }
    
    public int compararPorRaza( Perro p )
    {
        int valorComparacion = raza.compareToIgnoreCase( p.raza );
    	if(valorComparacion < 0){
    		valorComparacion = -1;
    	}else if(valorComparacion == 0){
    		valorComparacion = 0;
    	}else{
    		valorComparacion = 1;
    	}
        return valorComparacion;
    }

    public int compararPorPuntos( Perro p )
    {
        if( puntos == p.puntos )
            return 0;
        else if( puntos > p.puntos )
            return 1;
        else
            return -1;
    }

    public int compararPorEdad( Perro p )
    {
        if( edad == p.edad )
            return 0;
        else if( edad > p.edad )
            return 1;
        else
            return -1;
    }

    public String toString( )
    {
        return nombre + " (" + raza + ")";
    }

    // Invariante

    private void verificarInvariante( )
    {
        assert ( puntos >= 0 ) : "Los puntos no pueden ser menores a 0";
        assert ( edad > 0 ) : "La edad no puede ser 0";
        assert ( imagen != null ) : "La imagen no puede ser null";
        assert ( nombre != null ) : "El nombre no puede ser null";
        assert ( raza != null ) : "La raza no puede ser null";
    }
}
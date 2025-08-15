
package uniandes.cupi2.exposicionCanina.mundo;

import java.util.ArrayList;

public class ExposicionPerros
{
    // Atributos

	private ArrayList<Perro> perros;

    public ExposicionPerros() {
        perros = new ArrayList<>(); // Usando el operador diamante
    }

    // M�todos

   
    public ArrayList<Perro> darPerros() {
        ArrayList<Perro> copiaLista = new ArrayList<>(perros);
        return copiaLista;
    }


    public void ordenarPorRaza() {
        for (int i = 0; i < perros.size() - 1; i++) {
            for (int j = 0; j < perros.size() - 1 - i; j++) {
                Perro actual = perros.get(j);
                Perro siguiente = perros.get(j + 1);
                if (actual.darRaza().compareToIgnoreCase(siguiente.darRaza()) > 0) {
                    perros.set(j, siguiente);
                    perros.set(j + 1, actual);
                }
            }
        }
    }

    public void ordenarPorNombre( )
    {
    	for (int i = 1; i < perros.size(); i++) {
            Perro actual = perros.get(i);
            int j = i - 1;
            while (j >= 0 && perros.get(j).darNombre().compareToIgnoreCase(actual.darNombre()) > 0) {
                perros.set(j + 1, perros.get(j));
                j--;
            }
            perros.set(j + 1, actual);
        }
    }
    public void ordenarPorPuntos( )
    {
    	for (int i = 0; i < perros.size() - 1; i++) {
            for (int j = 0; j < perros.size() - 1 - i; j++) {
                Perro actual = perros.get(j);
                Perro siguiente = perros.get(j + 1);
                if (actual.darPuntos() > siguiente.darPuntos()) {
                    perros.set(j, siguiente);
                    perros.set(j + 1, actual);
                }
            }
        }
    }
    public void ordenarPorEdad( )
    {
    	for (int i = 0; i < perros.size() - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < perros.size(); j++) {
                if (perros.get(j).darEdad() < perros.get(indiceMenor).darEdad()) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                Perro temp = perros.get(i);
                perros.set(i, perros.get(indiceMenor));
                perros.set(indiceMenor, temp);
            }
        }
    }

    public int buscarPerro( String nombre )
    {
        int posicion = -1;
        boolean termine = false;

        for( int i = 0; i < perros.size( ) && !termine; i++ )
        {
            Perro perroPosicion = ( Perro )perros.get( i );
            String nombrePerro = perroPosicion.darNombre( );

            // Los nombres son iguales
            if( nombrePerro.equalsIgnoreCase( nombre ) )
            {
                posicion = i;
                termine = true;
            }
        }

        return posicion;
    }

    public int buscarBinarioPorNombre( String nombre )
    {
        int posicion = -1;
        int inicio = 0;
        int fin = perros.size( ) - 1;
        Perro aBuscar = new Perro( nombre, "", "", 1, 1 );
        while( inicio <= fin && posicion == -1 )
        {
            int medio = ( inicio + fin ) / 2;
            Perro mitad = ( Perro )perros.get( medio );
            if( mitad.compararPorNombre( aBuscar ) == 0 )
            {
                posicion = medio;
            }
            else if( mitad.compararPorNombre( aBuscar ) > 0 )
            {
                fin = medio - 1;
            }
            else
            {
                inicio = medio + 1;
            }
        }
        return posicion;
    }

    public boolean agregarPerro( String nombreP, String razaP, String imagenP, int puntosP, int edadP )
    {
        int perroBuscado = buscarPerro( nombreP );
        boolean agregado = false;
        if( perroBuscado == -1 )
        {
            Perro nuevoPerro = new Perro( nombreP, razaP, imagenP, puntosP, edadP );
            perros.add( nuevoPerro );
            agregado = true;
        }

        verificarInvariante( );

        return agregado;
    }

    public int buscarPerroMayorPuntaje( )
    {
        int posicion = -1;

        if( perros.size( ) > 0 )
        {
            Perro pMayorPuntaje = ( Perro )perros.get( 0 );
            posicion = 0;
            for( int i = 1; i < perros.size( ); i++ )
            {
                Perro perroPosicion = ( Perro )perros.get( i );

                // Los nombres son iguales
                if( pMayorPuntaje.compararPorPuntos( perroPosicion ) == -1 )
                {
                    posicion = i;
                    pMayorPuntaje = perroPosicion;
                }
            }
        }

        return posicion;
    }

    public int buscarPerroMenorPuntaje( )
    {
        int posicion = -1;

        if( perros.size( ) > 0 )
        {
            Perro pMenorPuntaje = ( Perro )perros.get( 0 );
            posicion = 0;
            for( int i = 1; i < perros.size( ); i++ )
            {
                Perro perroPosicion = ( Perro )perros.get( i );

                // Los nombres son iguales
                if( pMenorPuntaje.compararPorPuntos( perroPosicion ) == 1 )
                {
                    posicion = i;
                    pMenorPuntaje = perroPosicion;
                }
            }
        }

        return posicion;
    }

    public int buscarPerroMayorEdad( )
    {
        int posicion = -1;

        if( perros.size( ) > 0 )
        {
            Perro pMayorEdad = ( Perro )perros.get( 0 );
            posicion = 0;
            for( int i = 1; i < perros.size( ); i++ )
            {
                Perro perroPosicion = ( Perro )perros.get( i );

                // Los nombres son iguales
                if( pMayorEdad.compararPorEdad( perroPosicion ) == -1 )
                {
                    posicion = i;
                    pMayorEdad = perroPosicion;
                }
            }
        }

        return posicion;
    }

    private void verificarInvariante( )
    {
        assert ( perros != null ) : "La lista de perros no debe ser null";
        assert ( !buscarPerrosConNombresRepetidos( ) ) : "Hay dos perros con el mismo nombre";
    }

    private boolean buscarPerrosConNombresRepetidos( )
    {
        for( int i = 0; i < perros.size( ); i++ )
        {
            Perro perroI = ( Perro )perros.get( i );
            for( int j = 0; j < perros.size( ); j++ )
            {
                if( i != j )
                {
                    Perro perroJ = ( Perro )perros.get( j );
                    if( perroJ.darNombre( ).equals( perroI.darNombre( ) ) )
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Puntos de Extensi�n

    public void metodo1( )
    {
       ordenarPorNombre();
    }

    public String metodo2( )
    {
    	if (perros == null || perros.isEmpty()) {
            return "No hay perros registrados.";
        }

        Object mejor = perros.get(0);

        for (int i = 1; i < perros.size(); i++) {
            if (((Perro) perros.get(i)).darPuntos() > ((Perro) mejor).darPuntos()) {
                mejor = perros.get(i);
            }
        }

        return "El perro con más puntos es: " + ((Perro) mejor).darNombre() + " con " + ((Perro) mejor).darPuntos() + " puntos.";
    }
}
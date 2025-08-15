package uniandes.cupi2.sistemapacientes.mundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha
{

    private int dia;
    private int mes;
    private int anio;

    public void inicializar( int d, int m, int a )
    {
        dia = d;
        mes = m;
        anio = a;
    }

    public void inicializarHoy( )
    {

        GregorianCalendar gc = new GregorianCalendar( );

        dia = gc.get( Calendar.DAY_OF_MONTH );
        mes = gc.get( Calendar.MONTH ) + 1;
        anio = gc.get( Calendar.YEAR );
    }

    public int darDia( )
    {
        return dia;
    }

    public int darMes( )
    {
        return mes;
    }

    public int darAnio( )
    {
        return anio;
    }

    public int darDiferenciaEnMeses( Fecha fecha )
    {
        int diferencia = 0;

        int otroAnho = fecha.darAnio( );
        int otroMes = fecha.darMes( );
        int otroDia = fecha.darDia( );

        diferencia = 12 * ( otroAnho - anio ) + ( otroMes - mes );


        if( otroDia < dia )
            diferencia--;

        return diferencia;
    }

    public String toString( )
    {
        return "" + dia + "-" + mes + "-" + anio;
    }
}

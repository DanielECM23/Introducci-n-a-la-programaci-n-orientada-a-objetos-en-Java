package uniandes.cupi2.sistemapacientes.mundo;

import java.util.ArrayList;

public class SistemaPacientes 
{

    private ArrayList pacientes;
    private int pacienteActual;

    public SistemaPacientes( )
    {
    
    	pacientes = new ArrayList( );
    	
    	Fecha fechaNacimiento1 = new Fecha( );    	
        fechaNacimiento1.inicializar( 16, 6, 1989 );       
        Fecha fechaMuestra1 = new Fecha( );
        fechaMuestra1.inicializar( 5, 4, 2012 );
    	pacientes.add(new Paciente("Daniela", "Olivera Mesa", 1, fechaNacimiento1, fechaMuestra1,  50, 30, 23, 22,true, "data/Person_Undefined_Female_Light.png"));
    	
    	Fecha fechaNacimiento2 = new Fecha( );    	
        fechaNacimiento2.inicializar( 12, 12, 1944 );       
        Fecha fechaMuestra2 = new Fecha( );
        fechaMuestra2.inicializar( 30, 3, 2013 );    	
    	pacientes.add(new Paciente("Roberto", "Espinoza", 2, fechaNacimiento2, fechaMuestra2,  60, 30, 25, 21,false, "data/ArmyNurse_Female_Dark.png"));
    	
    	Fecha fechaNacimiento3 = new Fecha( );    	
        fechaNacimiento3.inicializar( 25, 7, 1978 );       
        Fecha fechaMuestra3 = new Fecha( );
        fechaMuestra3.inicializar( 21, 4, 2015 ); 
    	pacientes.add(new Paciente("Pepito", "Perez", 2, fechaNacimiento3, fechaMuestra3, 70, 40, 33, 12,true, "data/Cowboy.png"));     
    	pacienteActual=0;
    }

    public ArrayList darPacientes()
    {
    	return pacientes;
    }

    public Paciente darPacienteActual( )
    {
        Paciente respuesta = (Paciente) pacientes.get( pacienteActual );
        return respuesta;
    }

    public Paciente darPacienteSiguiente( )
    {
        pacienteActual++;
        if(pacienteActual==pacientes.size( ))
        {
            pacienteActual=0;
        }
        Paciente respuesta = (Paciente) pacientes.get( pacienteActual );
        return respuesta;
    }

    public Paciente darPacienteAnterior()
    {
        if(pacienteActual==0)
        {
            pacienteActual=pacientes.size( );
        }
        pacienteActual--;
        Paciente respuesta = (Paciente) pacientes.get( pacienteActual );
        return respuesta;
    }
	
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    public String metodo2( )
    {
        return "Respuesta 2";
    }

}

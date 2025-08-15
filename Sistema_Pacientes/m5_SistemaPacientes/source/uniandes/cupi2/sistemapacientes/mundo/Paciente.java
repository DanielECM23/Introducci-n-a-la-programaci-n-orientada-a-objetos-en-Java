package uniandes.cupi2.sistemapacientes.mundo;

public class Paciente
{

    private String nombre;
    private String apellido;
    private int sexo;
    private Fecha fechaNacimiento;
    private Fecha fechaTomaMuestra;
    private String imagen;
	private double volumenMuestra; 
    private double volumenEritrocitos;
    private int conteoLeucocitos; 
    private int conteoPlaquetas;
    private boolean enAyunas;

    public Paciente( String pNombre, String pApellido, int pSexo, Fecha pFechaN, Fecha pFechaTomaMuestra, double pVolumenMuestra, 
    		         double pVolumenEritrocitos, int pConteoLeucocitos, int pConteoPlaquetas, boolean pEnAyunas, String pImagen )
    {
        nombre = pNombre;
        apellido = pApellido;
        sexo = pSexo;
        fechaNacimiento = pFechaN;
        fechaTomaMuestra = pFechaTomaMuestra;
        imagen = pImagen;
        volumenMuestra = pVolumenMuestra;
        volumenEritrocitos = pVolumenEritrocitos;
        conteoLeucocitos = pConteoLeucocitos;
        conteoPlaquetas = pConteoPlaquetas;
        enAyunas = pEnAyunas;
    }

    public String darApellido( )
    {
        return apellido;
    }
    public String darFechaTomaMuestra( )
    {
        String strFecha = fechaTomaMuestra.toString( );
        return strFecha;
    }

    public String darFechaNacimiento( )
    {
        String strFecha = fechaNacimiento.toString( );
        return strFecha;
    }

    public String darImagen( )
    {
        return imagen;
    }

    public String darNombre( )
    {
        return nombre;
    }

    public int darSexo( )
    {
        return sexo;
    }

    public int darEdad( )
    {

        Fecha hoy = new Fecha( );
        hoy.inicializarHoy( );

        int edad = fechaNacimiento.darDiferenciaEnMeses( hoy ) / 12;

        return edad;
    }

	public double calcularHematocrito() 
	{
		double calculoHematocrito = (volumenEritrocitos / volumenMuestra) * 100;
		return calculoHematocrito;
	}

	public double calcularLeucocitos()
	{
		double calculoLeucocitos = (conteoLeucocitos / (volumenMuestra - volumenEritrocitos)) * 100;
		return calculoLeucocitos;
	}

    public double darVolumenMuestra() 
    {
		return volumenMuestra;
	}

	public double darVolumenEritrocitos() 
	{
		return volumenEritrocitos;
	}

	public int darConteoLeucocitos() 
	{
		return conteoLeucocitos;
	}

	public int darConteoPlaquetas() 
	{
		return conteoPlaquetas;
	}

	public boolean darEnAyunas() 
	{
		return enAyunas;
	}

	public void cambiarVolumenMuestra(double pVolumenMuestra) 
	{
		volumenMuestra = pVolumenMuestra;
	}

	public void cambiarVolumenEritrocitos(double pVolumenEritrocitos) 
	{
		volumenEritrocitos = pVolumenEritrocitos;
	}

	public void cambiarConteoLeucocitos(int pConteoLeucocitos) 
	{
		conteoLeucocitos = pConteoLeucocitos;
	}

	public void cambiarConteoPlaquetas(int pConteoPlaquetas) 
	{
		conteoPlaquetas = pConteoPlaquetas;
	}
   
}
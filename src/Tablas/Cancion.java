package Tablas;

public class Cancion {

	private String nombreCancion;
	
	private int duracion;
	
	private String genero;
	
	public Cancion (String pNombreCancion, int pDuracion, String pGenero)
	{
		nombreCancion = pNombreCancion;
		duracion = pDuracion;
		genero = pGenero;
	}
	
	public String darNombreCancion()
	{
		return nombreCancion;
	}
	
	public int darDuracion()
	{
		return duracion;
	}
	
	public String darGenero()
	{
		return genero;
	}
	
	public void cambiarNombreCancion( String pNombreCancion )
	{
		nombreCancion = pNombreCancion;
	}
	
	public void cambiarDuracion( int pDuracion )
	{
		duracion = pDuracion;
	}
	
	public void cambiarGenero( String pGenero )
	{
		genero = pGenero;
	}
}

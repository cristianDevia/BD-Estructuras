package Tablas;

public class Artista {
	
	private String nombreArtista;
	
	private boolean tipoDeArtista;
	
	private String pais;
	
	
	public Artista(String pNombreArtista, boolean pTipoDeArtista, String pPais)
	{
		
		nombreArtista = pNombreArtista;
		tipoDeArtista = pTipoDeArtista;
		pais = pPais;
		
	}
	
	public String darNombreArtista()
	{
		return nombreArtista;
	}
	
	public boolean darTipoDeArtista()
	{
		return tipoDeArtista;
	}
	
	public String darPais()
	{
		return pais;
	}
	
	public void cambiarNombreArtista( String pNombreArtista )
	{
		nombreArtista = pNombreArtista;
	}
	
	public void cambiarTipoDeArtista( boolean pTipoArtista)
	{
		tipoDeArtista = pTipoArtista;
	}
	
	public void cambiarPais( String pPais )
	{
		pais = pPais;
	}
	
	
}

package Tablas;

public class Artista {
	
	private String nombreArtista;
	
	private boolean tipoDeArtista;
	
	private String pais;
	
	private Artista siguiente;
	
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
	
	public Artista darSiguiente()
	{
		return siguiente;
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
	
	public void cambiarSiguiente( Artista pSiguiente )
	{
		siguiente = pSiguiente;
	}
	
}

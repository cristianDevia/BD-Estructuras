package Libreria.Generica;

public interface IFactory <T>{

	public T newObject(String pNombreArtista, boolean pTipoDeArtista, String pPais);
	

	
}

package Libreria.Generica;

import Tablas.Artista;

public class FactoryArtista implements IFactory<Artista>{

	
	public Artista newObject(String pNombreArtista, boolean pTipoDeArtista, String pPais) {
		
		return new Artista(pNombreArtista, pTipoDeArtista, pPais);
	}


}

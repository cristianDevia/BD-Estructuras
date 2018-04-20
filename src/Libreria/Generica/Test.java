package Libreria.Generica;

import Tablas.Artista;
import Tablas.Cancion;

public class Test {
	
	
	public static void main(String[] args) {
		
		FactoryArtista f= new FactoryArtista();
		
		f.newObject("adsasd", true, "adads");
		
		System.out.println(f);
		
		
	}

}

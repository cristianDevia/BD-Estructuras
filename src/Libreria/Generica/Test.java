package Libreria.Generica;

import java.io.Console;
import java.lang.reflect.Constructor;

import Tablas.Artista;
import Tablas.Cancion;

public class Test {
	
	
	public static void main(String[] args) {
		
	try {
		
		FactoryArtista f = new FactoryArtista();
		Class< ? extends FactoryArtista> cls = f.getClass();
		
		System.out.println("Funcione please = " + f.toString());
		
		FactoryArtista obj = cls.newInstance();
		System.out.println("Aiuda = " + obj.newObject("Juanes", true, "Colombia"));
		
	} 	catch(InstantiationException e) {
        System.out.println(e.toString());
     } 	catch(IllegalAccessException e) {
        System.out.println(e.toString());
     }
	
	}

}

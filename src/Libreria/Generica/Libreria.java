package Libreria.Generica;

import Tablas.Artista;
import Tablas.Cancion;

public class Libreria <T>
{

	String Juanes = null;
	boolean algo = true;
	String Colombia;
	
	public T newElemento(IFactory<T> f)
	{
		return f.newObject(Juanes, algo, Colombia);
	}
	

}

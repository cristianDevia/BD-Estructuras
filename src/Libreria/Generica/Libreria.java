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

	@Override
	public String toString() {
		return "Libreria [Juanes=" + Juanes + ", algo=" + algo + ", Colombia=" + Colombia + "]";
	}
	

//	public T nuevoElemento(IFactory<T> f)
//	{
//		String Juanes = null;
//		boolean algo = true;
//		String Colombia = null;
//		
//		T noTengoNiPutaIdeaDeQueEsEsto = f.newObject(Juanes, algo, Colombia);
//		
//		return noTengoNiPutaIdeaDeQueEsEsto;
//		
//	}
	

	
}

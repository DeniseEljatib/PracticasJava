package ar.edu.ort.tp1.tp6Ej3.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDeTerminos extends ListaOrdenadaNodos<String, Termino> {

	@Override
	public int compare(Termino termino1, Termino termino2) {

		return termino1.getClave().compareTo(termino2.getClave());
	}

	@Override
	public int compareByKey(String clave1, Termino termino2) {
		return clave1.compareTo(termino2.getClave());
	}

}

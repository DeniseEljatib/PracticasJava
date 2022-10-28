package ar.edu.ort.tp1.tp6Ej3.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDeIdiomas extends ListaOrdenadaNodos<String, Idioma> {

	@Override
	public int compare(Idioma idioma1, Idioma idioma2) {

		return idioma1.getClave().compareTo(idioma2.getClave());
	}

	@Override
	public int compareByKey(String clave1, Idioma idioma2) {

		return clave1.compareTo(idioma2.getClave());
	}

}

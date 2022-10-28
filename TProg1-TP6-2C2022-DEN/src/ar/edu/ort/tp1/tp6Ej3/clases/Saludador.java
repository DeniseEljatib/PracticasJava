package ar.edu.ort.tp1.tp6Ej3.clases;

import java.util.Scanner;

/**
 * Esta clase debe: - Cargar uno o mas diccionarios (uno en cada idioma, al
 * menos dos) para que pueda: -- Mostrar errores -- Dar la bienvenida --
 * Solicitar un nombre (para que el Saludador lo pida por teclado). -- Decirle
 * que tiene un lindo nombre -- Mostrar un saludo de despedida usando el nombre
 * pedido por teclado. - Elegir un idioma - Ejecutar una rutima que: -- Salude
 * -- Pida el nombre -- Lo cargue por teclado -- Diga que es un lindo nombre --
 * Despedir usando el nombre
 */
public class Saludador {

	private Diccionario diccionario;
	private String idioma;
	private Scanner input;

	public Saludador(String idioma) {
		this.diccionario = new Diccionario();
		cargarDiccionario(diccionario);
		elegirIdioma(idioma);
	}

	private void cargarDiccionario(Diccionario diccionario) {
		// TODO -Carga los diccionarios de los distintos idiomas
		diccionario.agregarIdioma("ES", "Español");
		diccionario.agregarIdioma("EN", "Inglés");
		diccionario.agregarIdioma("FR", "Francés");
		diccionario.agregarTermino("ES", "BIENVENIDA", "¡Hola! Ingresá tu nombre, por favor:");
		diccionario.agregarTermino("ES", "LINDO_NOMBRE", "¡Qué lindo nombre!");
		diccionario.agregarTermino("ES", "DESPEDIDA", "¡Adiós, %s! ¡Que tengas un lindo día!\n");
		diccionario.agregarTermino("ES", "AFIRMATIVO", "Sí");
		diccionario.agregarTermino("ES", "NEGATIVO", "No");
		diccionario.agregarTermino("EN", "BIENVENIDA", "Hello! Enter you name, please:");
		diccionario.agregarTermino("EN", "LINDO_NOMBRE", "That's a very nice name!");
		diccionario.agregarTermino("EN", "DESPEDIDA", "Bye, %s! Have a nice day!\n");
		diccionario.agregarTermino("EN", "AFIRMATIVO", "Yes");
		diccionario.agregarTermino("EN", "NEGATIVO", "No");
		diccionario.agregarTermino("FR", "BIENVENIDA", "Bonjour! Quel est ton nom?");
		diccionario.agregarTermino("FR", "LINDO_NOMBRE", "Quel joli prénom!");
		diccionario.agregarTermino("FR", "DESPEDIDA", "Au revoir, %s! Bonne journée!\n");
		diccionario.agregarTermino("FR", "AFIRMATIVO", "Oui");
		diccionario.agregarTermino("FR", "NEGATIVO", "Non");

	}

	public void elegirIdioma(String idioma) throws RuntimeException {
		if (diccionario.idiomaValido(idioma)) {
			this.idioma = idioma;
		} else {
			throw new RuntimeException(diccionario.obtenerTermino(this.idioma, "IDIOMA_INVALIDO"));
		}
	}

	public void run() {
		System.out.println(diccionario.obtenerTermino(this.idioma, "BIENVENIDA"));
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println(diccionario.obtenerTermino(this.idioma, "LINDO_NOMBRE"));
		System.out.printf(String.format(diccionario.obtenerTermino(this.idioma, "DESPEDIDA"), nombre));
		

	}

}

package ar.edu.ort.tp1.tp6Ej1;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;
import ar.edu.ort.tp1.tp6Ej1.clases.FabricanteDePelotas;
import ar.edu.ort.tp1.tp6Ej1.clases.PelotaDeTenis;
import ar.edu.ort.tp1.tp6Ej1.clases.TuboPelotasDeTenis;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Obtener un tubo de pelotas de tenis del Fabricante
		TuboPelotasDeTenis tuboDePelotas = FabricanteDePelotas.fabricarTubo();

		// Sacar una pelota del tubo, usara una vez y volverla la guardar.
		PelotaDeTenis pelota = tuboDePelotas.extraer();
		pelota.usar();
		tuboDePelotas.guardar(pelota);

		// Desarrollar el metodo nombrado a continuacion.
		// Debe quedar tal como estaba al recibirlo.
		listarContenidoTubo(tuboDePelotas);
		
		System.out.println("Vamos de nuevo para ver que la pila haya quedado igual");
		listarContenidoTubo(tuboDePelotas);
	}

	private static void listarContenidoTubo(TuboPelotasDeTenis tuboDePelotas) {
		Pila<PelotaDeTenis> pilaAux = new PilaNodos<>();
		while (!tuboDePelotas.estaVacio()) {
			PelotaDeTenis pelota = tuboDePelotas.extraer();
			System.out.println(pelota.toString());
			pilaAux.push(pelota);
		}
		while (!pilaAux.isEmpty()) {
			tuboDePelotas.guardar(pilaAux.pop());
		}

	}

}

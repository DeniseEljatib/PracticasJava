package ar.edu.ort.tp1.tp6Ej5.clases;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class Taller {
	private static final int MAX_TRABAJOS_DIARIOS = 50;
	private static float PRECIO_HORA = 3000;
	private static Scanner input = new Scanner(System.in);
	// TODO Completar definicion de atributos

	public Taller() {
		// TODO Implementar constructor
	}

	/**
	 * Procesa el ingreso de un vehiculo
	 * @param patente
	 * @param marca
	 * @param airbag
	 */
	public void agregarVehiculoEnEspera(String patente, String marca, EstadoAirbag airbag) {
		// TODO - Implementar
	}

	/**
	 * Procesa el ingreso de un vehiculo
	 * @param patente
	 * @param marca
	 * @param cilindrada
	 * @param tieneLimitador
	 */
	public void agregarVehiculoEnEspera(String patente, String marca, int cilindrada, boolean tieneLimitador) {
		// TODO - Implementar
	}

	/**
	 * Procesa el ingreso de un vehiculo
	 * @param vehiculo
	 */
	private void agregarVehiculoEnEspera(Vehiculo vehiculo) {
		vehiculosEnPuerta.add(vehiculo);
	}

	/**
	 * Crea una estructura a nivel de la clase que guarda todos los servicios
	 * posibles, los que luego seran asignados a los vehiculos que ingresen al taller.
	 */
	public void cargarServicios() {
		String[] nombresServicios = { "Cambio de Bateria", "Cambio Aceite y Filtro", "Alineacion y Balanceo",
				"Cambio amortiguadores", "Servicio completo" };
		float[] duracionEstimadaServicio = { 0.5f, 1, 1.5f, 2, 3 };
		// TODO - Para los que tienen que recuperar Arrays
	}

	private Trabajo crearTrabajo(Vehiculo vehiculo) {
		int numero = 0;
		numero = pedirServicio();
		Servicio servicio = servicios[numero - 1];
		Trabajo trabajo = new Trabajo(vehiculo, servicio);
		return trabajo;
	}

	public void informarImporteServicios() {
		float total = 0;
		for (Trabajo trabajo : trabajosRealizados) {
			System.out.println(trabajo);
			total += trabajo.getImporte();
		}
		System.out.println("La recaudacion del dia fue:" + total);
	}

	/**
	 * Genera e informa la cantidad de servicios realizados para cada tipo de servicio.
	 */
	public void informarResumenServicios() {
		// TODO - Para los que deben Arrays: Reemplazar por lo correcto y
		// completar
		int[] cantidadPorServicios = null;
	}

	private void mostrarMenuServicios() {
		for (int i = 0; i < servicios.length; i++) {
			System.out.println(servicios[i]);
		}
	}

	private int pedirServicio() {
		int numero = 0;
		boolean ok = false;
		while (!ok) {
			try {
				mostrarMenuServicios();
				System.out.println("Solicite un servicio 1-5:");
				numero = input.nextInt();
				if (numero > 0 && numero <= servicios.length) {
					ok = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error. Ingrese un numero correcto");
			} finally {
				input.nextLine();
			}
		}
		return numero;
	}

	/**
	 * Asumiendo que ya todos los vehiculos en espera son validos agrega
	 * a cada uno a los trabajos pendientes. Al agregarlos pide tambien
	 * el servicio a realizar. (Para crear un Trabajo hacen falta un Vehiculo y un Servicio.
	 */
	public void procesarIngresoVehiculos() {
		// TODO - Implementar. Usa el metodo crearTrabajo
	}

	public void procesarServicios() {
		Trabajo trabajo;
		while (!trabajosPendientes.isEmpty()) {
			trabajo = trabajosPendientes.removeAt(0);
			trabajo.aplicarPrecioHora(PRECIO_HORA);
			trabajosRealizados.add(trabajo);
		}
	}

	public void reportarTrabajosPendientes() {
		trabajosPendientes.reportar();
	}

	/**
	 * Para evitar contratiempos chequea que los vehiculos que esperan
	 * en la puerta cumplan con las nuevas condiciones de atencion.
	 * Como puede procesarse mas de una vez debe asegurarse de mantener
	 * el orden de los vehiculos en puerta.
	 */
	public void revisarVehiculosEnPuerta() {
		// TODO Implementar
	}

}
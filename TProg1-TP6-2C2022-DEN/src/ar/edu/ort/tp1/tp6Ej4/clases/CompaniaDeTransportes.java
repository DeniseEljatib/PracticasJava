package ar.edu.ort.tp1.tp6Ej4.clases;

import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class CompaniaDeTransportes {
	private static int ultimoLegajo = 0;

	private ListaChoferes staff;
	private ListaVehiculos flota;
	private Cola<Vehiculo> viajesListos;
	private final static String MSG_ERROR_ASIGNACION = "ERROR EN LA ASIGNACIÓN DE VEHÍCULO A CHOFER"; 
	

	// 1 - Crear las estructuras propuestas
	public CompaniaDeTransportes() {
		// TODO
		this.staff = new ListaChoferes();
		this.flota = new ListaVehiculos();
	}

	public void altaChofer(int dni, String nombre) {
		Chofer chofer = staff.search(dni);
		if (chofer != null) {
			throw new RuntimeException("¡Chofer existente!");
		}
		staff.add(new Chofer(dni, proximoLegajo(), nombre));
	}

	public Chofer bajaChofer(int dni) {
		Chofer chofer = staff.search(dni);
		if (chofer != null) {
			if (chofer.getVehiculo() == null)
				staff.remove(chofer);
			else
				throw new RuntimeException("¡No se puede despedir a un chofer en viaje!");
		}
		return chofer;
	}

	public void altaVehiculo(String patente, TipoVehiculo tipoVehiculo, double capacidadDeCarga) {
		Vehiculo vehiculo = flota.search(patente);
		if (vehiculo != null) {
			throw new RuntimeException("¡Vehículo existente!");
		}
		flota.add(new Vehiculo(patente, tipoVehiculo, capacidadDeCarga));
	}

	private static int proximoLegajo() {
		return ++ultimoLegajo;
	}

	public void listarChoferes() {
		for (Chofer chofer : staff) {
			System.out.println(chofer);
		}
	}

	public void listarVehiculos() {
		for (Vehiculo vehiculo : flota) {
			System.out.println(vehiculo);
		}
	}

	// 2 - Asignar un vehiculo a un chofer (utilizando Excepciones)
	public void asignarVehiculo(String patenteVehiculo, int dniChofer) {
		// TODO implementar
		Chofer chofer = staff.search(dniChofer);
		Vehiculo vehiculo = flota.search(patenteVehiculo); 
		if (chofer != null && vehiculo!=null) {
			if (chofer.getVehiculo() == null)
				chofer.asignarVehiculo(vehiculo);
			else
				throw new RuntimeException("El chofer indicado ya tiene asignado un vehículo");
		}
		
		
		
	}

	// 3 - Asignar una carga (utilizando Excepciones) al vehiculo que más se
	// adapte al peso de la carga.
	// a - Vehiculo con conductor asignado.
	// b - No debe tener carga asignada.
	// c - Su capacidad debe ser mayor o igual al peso de la carga.
	// De todos los vehículos posibles debe quedarse con el menor de todos
	// ellos.
	//
	// Si se logra asignar la carga el vehiculo debe agregarse a la cola de
	// vehiculos listos para partir.
	public void asignarCarga(Carga carga) {
		System.out.println("\n*** ASIGNACION DE CARGA ***");
		// TODO implementar
	}

	// 4 - Listar choferes libres (que no estan de viaje)
	public void listarChoferesLibres() {
		System.out.println("\n--- Choferes Libres ---");
		// TODO implementar
	}

	// 5 - Listar los vehiculos listos para salir de viaje (la estructura debe
	// quedar en el orden inicial).
	public void listarVehiculosListosParaPartir() {
		// TODO implementar
	}

}
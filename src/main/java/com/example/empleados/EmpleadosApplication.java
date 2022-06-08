package com.example.empleados;

import com.example.empleados.clases.Empleado;


public class EmpleadosApplication {

	public static void main(String[] args) {
		Empleado.Builder emplBuilder = new Empleado.Builder();

		Empleado.Builder empleado = emplBuilder
				.setName("Marcos")
				.setAge(24)
				.setDepartment("Backend");

		System.out.println(empleado.toString());
	}

}

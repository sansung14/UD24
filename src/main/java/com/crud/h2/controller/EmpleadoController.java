package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Empleado;
import com.crud.h2.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	public enum empleo {
		Frontend, Backend, Developer
	};

	@Autowired
	EmpleadoServiceImpl empleadoServideImpl;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServideImpl.listarEmpleados();
	}



	// listar Empleados por campo trabajo
	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<Empleado> listarEmpleadoTrabajo(@PathVariable(name = "trabajo") empleo trabajo) {
		return empleadoServideImpl.listarEmpleadoTrabajo(trabajo);
	}

	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {

		return empleadoServideImpl.guardarEmpleado(empleado);
	}

	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name = "id") Long id) {

		Empleado empleado_xid = new Empleado();

		empleado_xid = empleadoServideImpl.empleadoXID(id);

		System.out.println("Empleado XID: " + empleado_xid);

		return empleado_xid;
	}

	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") Long id, @RequestBody Empleado empleado) {

		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();

		empleado_seleccionado = empleadoServideImpl.empleadoXID(id);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		empleado_seleccionado.setSalario(empleado.getSalario());

		empleado_actualizado = empleadoServideImpl.actualizarEmpleado(empleado_seleccionado);

		System.out.println("El empleado actualizado es: " + empleado_actualizado);

		return empleado_actualizado;
	}

	@DeleteMapping("/empleados/{id}")
	public void eleiminarEmpleado(@PathVariable(name = "id") Long id) {
		empleadoServideImpl.eliminarEmpleado(id);
	}

}

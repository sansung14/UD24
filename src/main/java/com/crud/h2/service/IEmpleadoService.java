package com.crud.h2.service;

import java.util.List;

import com.crud.h2.controller.EmpleadoController.empleo;
/**
 * @author David
 *
 */
import com.crud.h2.dto.Empleado;

public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado empleadoXID(Long id); //Leer datos de un empleado READ
	
	public List<Empleado> listarEmpleadoNomnbre(String nombre);//Listar Empleados por campo nombre
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE


	public List<Empleado> listarEmpleadoTrabajo(empleo trabajo);
	
	
}

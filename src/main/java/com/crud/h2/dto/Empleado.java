package com.crud.h2.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.crud.h2.controller.EmpleadoController.empleo;

@Entity
@Table(name="empleado")//en caso que la tabala sea diferente
public class Empleado {


	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private empleo trabajo;
	@Column(name = "salario")//no hace falta si se llama igual
	private double salario;

	
	//Constructores
	
	public Empleado() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param trabajo
	 * @param salario
	 */
	public Empleado(Long id, String nombre, empleo trabajo, double salario) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;

	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;

		
	}

	public empleo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(empleo trabajo) {
		switch (trabajo) {
		case Backend:
			this.trabajo=empleo.Backend;
			this.salario=1500;
			break;
		case Frontend:
			this.trabajo=empleo.Frontend;
			this.salario=2000;
			break;
		case Developer:
			this.trabajo=empleo.Developer;
			this.salario=3000;
			break;
		}
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}




	
	
	
	
}

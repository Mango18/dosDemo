package com.ejemplo.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name ="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer IdUsuario;
	public String nombre;
	public String apellido;
	
	
	 /* Relación many to many *****************************************
	 * 	public List<tabla2> tabla2;
	 * @ManyToMany
	 * @JoinTable(
	 * 		name= "tabla2",
	 * 		joinColumns = @JoinColumns (name = "tabla1_id")
	 * 		inverseJoinColumns = @JoinColumns (name = "tabla2_id"))
	 ******************************************************************/
	
	
	
	
	
	public Integer getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}

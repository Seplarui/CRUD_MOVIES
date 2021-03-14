package com.init.movies.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@Column(name="idMovie")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMovie;
	
	@Column(name="tituloPelicula", nullable=false, length=100)
	private String tituloPelicula;
	
	@Column(name="anopelicula", nullable=true, length=4)
	private int anoPelicula;
	
	@Column(name="vistapelicula", nullable=false, length=1)
	private int vistaPelicula;
	
	@Column(name="fechavistapelicula", nullable=true, length=10)
	private String fechaVistaPelicula;
	
	
	
	public Long getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(Long idMovie) {
		this.idMovie = idMovie;
	}
	public String getTituloPelicula() {
		return tituloPelicula;
	}
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
	public int getAnoPelicula() {
		return anoPelicula;
	}
	public void setAnoPelicula(int anoPelicula) {
		this.anoPelicula = anoPelicula;
	}
	public int getVistaPelicula() {
		return vistaPelicula;
	}
	public void setVistaPelicula(int vistaPelicula) {
		this.vistaPelicula = vistaPelicula;
	}
	public String getFechaVistaPelicula() {
		return fechaVistaPelicula;
	}
	public void setFechaVistaPelicula(String fechaVistaPelicula) {
		this.fechaVistaPelicula = fechaVistaPelicula;
	}

}

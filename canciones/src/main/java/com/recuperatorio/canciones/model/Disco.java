package com.recuperatorio.canciones.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Disco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	private String nombre;
    private LocalDate fechaLanzamiento;

    @ManyToOne
    @JoinColumn(name = "artista_id")
    private Artista artista;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @OneToMany
    @JoinColumn(name = "disco_id")
    private List<Cancion> canciones;

}

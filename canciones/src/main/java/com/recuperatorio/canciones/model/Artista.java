package com.recuperatorio.canciones.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private LocalDate fechaFallecimiento;
    private String biografia;
    private int cantidadCanciones;

    @ElementCollection
    @CollectionTable(name = "artista_generos", joinColumns = @JoinColumn(name = "artista_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "genero")
    private List<Genero> generos;

    @ElementCollection
    @CollectionTable(name = "artista_instrumentos", joinColumns = @JoinColumn(name = "artista_id"))
    @Column(name = "instrumento")
    private List<String> instrumentos;

    // getters and setters

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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    public void setFechaFallecimiento(LocalDate fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public List<String> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<String> instrumentos) {
        this.instrumentos = instrumentos;
    }
}

package com.recuperatorio.canciones.service;

import com.recuperatorio.canciones.model.Artista;
import com.recuperatorio.canciones.model.Genero;
import com.recuperatorio.canciones.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;

    public Artista crearArtista(Artista artista) {
        return artistaRepository.save(artista);
    }

    public Artista obtenerArtistaPorId(Long id) {
        return artistaRepository.findById(id).orElse(null);
    }

    public List<Artista> obtenerArtistasPorGenero(Genero genero) {
        return artistaRepository.findByGenerosContaining(genero);
    }

    public List<Artista> obtenerArtistasPorNacionalidad(String nacionalidad) {
        return artistaRepository.findByNacionalidad(nacionalidad);
    }

    public List<Artista> obtenerArtistasPorInstrumento(String instrumento) {
        return artistaRepository.findByInstrumentosContaining(instrumento);
    }

    public List<Artista> obtenerArtistasPorEdad(int edad) {
        LocalDate hoy = LocalDate.now();
        return artistaRepository.findAll().stream()
                .filter(artista -> Period.between(artista.getFechaNacimiento(), hoy).getYears() == edad)
                .collect(Collectors.toList());
    }

    public List<Artista> obtenerArtistasPorCantidadDeCanciones(int cantidadCanciones) {
        return artistaRepository.findByCantidadCanciones(cantidadCanciones);
    }

    public List<Artista> obtenerArtistasVivos() {
        return artistaRepository.findByFechaFallecimientoIsNull();
    }

    public List<Artista> obtenerArtistasFallecidos() {
        return artistaRepository.findByFechaFallecimientoIsNotNull();
    }

    public List<Artista> obtenerTodosLosArtistas() {
        return artistaRepository.findAll();
    }
}

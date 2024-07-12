package com.recuperatorio.canciones.repository;

import com.recuperatorio.canciones.model.Artista;
import com.recuperatorio.canciones.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    List<Artista> findByGenerosContaining(Genero genero);
    List<Artista> findByNacionalidad(String nacionalidad);
    List<Artista> findByInstrumentosContaining(String instrumento);
    List<Artista> findByFechaFallecimientoIsNull();
    List<Artista> findByFechaFallecimientoIsNotNull();
    List<Artista> findByCantidadCanciones(int cantidadCanciones);
}

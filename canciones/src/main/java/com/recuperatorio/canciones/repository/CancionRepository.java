package com.recuperatorio.canciones.repository;

import com.recuperatorio.canciones.model.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CancionRepository extends JpaRepository<Cancion, Long> {
    List<Cancion> findByNombreContaining(String nombre);
    List<Cancion> findByLetraContaining(String letra);
    List<Cancion> findByGenero(String genero);
}

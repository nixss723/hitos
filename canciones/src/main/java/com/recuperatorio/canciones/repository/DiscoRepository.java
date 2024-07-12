package com.recuperatorio.canciones.repository;

import com.recuperatorio.canciones.model.Disco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscoRepository extends JpaRepository<Disco, Long> {
    List<Disco> findByNombreContaining(String nombre);
    List<Disco> findByGenero(String genero);
    List<Disco> findByFechaLanzamiento(String fecha);
}

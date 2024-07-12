package com.recuperatorio.canciones.service;

import com.recuperatorio.canciones.model.Cancion;
import com.recuperatorio.canciones.repository.CancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancionService {
    @Autowired
    private CancionRepository cancionRepository;

    public Cancion crearCancion(Cancion cancion) {
        return cancionRepository.save(cancion);
    }

    public Cancion obtenerCancionPorId(Long id) {
        return cancionRepository.findById(id).orElse(null);
    }

    public List<Cancion> buscarPorNombre(String nombre) {
        return cancionRepository.findByNombreContaining(nombre);
    }

    public List<Cancion> buscarPorLetra(String letra) {
        return cancionRepository.findByLetraContaining(letra);
    }

    public List<Cancion> buscarPorGenero(String genero) {
        return cancionRepository.findByGenero(genero);
    }

}

package com.recuperatorio.canciones.service;

import com.recuperatorio.canciones.model.Disco;
import com.recuperatorio.canciones.repository.DiscoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscoService {
    @Autowired
    private DiscoRepository discoRepository;

    public Disco crearDisco(Disco disco) {
        return discoRepository.save(disco);
    }

    public Disco obtenerDiscoPorId(Long id) {
        return discoRepository.findById(id).orElse(null);
    }

    public List<Disco> buscarPorNombre(String nombre) {
        return discoRepository.findByNombreContaining(nombre);
    }

    public List<Disco> buscarPorGenero(String genero) {
        return discoRepository.findByGenero(genero);
    }

    public List<Disco> buscarPorFecha(String fecha) {
        return discoRepository.findByFechaLanzamiento(fecha);
    }

    public List<Disco> todosLosDiscos() {
        return discoRepository.findAll();
    }

}

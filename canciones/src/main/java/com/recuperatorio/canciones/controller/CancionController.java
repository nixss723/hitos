package com.recuperatorio.canciones.controller;

import com.recuperatorio.canciones.model.Cancion;
import com.recuperatorio.canciones.service.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canciones")
public class CancionController {
    @Autowired
    private CancionService cancionService;

    @PostMapping
    public Cancion crearCancion(@RequestBody Cancion cancion) {
        return cancionService.crearCancion(cancion);
    }

    @GetMapping("/{id}")
    public Cancion obtenerCancionPorId(@PathVariable Long id) {
        return cancionService.obtenerCancionPorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Cancion> buscarPorNombre(@PathVariable String nombre) {
        return cancionService.buscarPorNombre(nombre);
    }

    @GetMapping("/letra/{letra}")
    public List<Cancion> buscarPorLetra(@PathVariable String letra) {
        return cancionService.buscarPorLetra(letra);
    }

}

package com.recuperatorio.canciones.controller;

import com.recuperatorio.canciones.model.Disco;
import com.recuperatorio.canciones.service.DiscoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discos")
public class DiscoController {
    @Autowired
    private DiscoService discoService;

    @PostMapping
    public Disco crearDisco(@RequestBody Disco disco) {
        return discoService.crearDisco(disco);
    }

    @GetMapping("/{id}")
    public Disco obtenerDiscoPorId(@PathVariable Long id) {
        return discoService.obtenerDiscoPorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Disco> buscarPorNombre(@PathVariable String nombre) {
        return discoService.buscarPorNombre(nombre);
    }

    @GetMapping("/genero/{genero}")
    public List<Disco> buscarPorGenero(@PathVariable String genero) {
        return discoService.buscarPorGenero(genero);
    }

    @GetMapping("/fecha/{fecha}")
    public List<Disco> buscarPorFecha(@PathVariable String fecha) {
        return discoService.buscarPorFecha(fecha);
    }

    @GetMapping
    public List<Disco> todosLosDiscos() {
        return discoService.todosLosDiscos();
    }

}

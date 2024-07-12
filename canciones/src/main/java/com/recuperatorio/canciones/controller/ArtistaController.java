package com.recuperatorio.canciones.controller;

import com.recuperatorio.canciones.model.Artista;
import com.recuperatorio.canciones.model.Genero;
import com.recuperatorio.canciones.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {
    @Autowired
    private ArtistaService artistaService;

    @PostMapping
    public Artista crearArtista(@RequestBody Artista artista) {
        return artistaService.crearArtista(artista);
    }

    @GetMapping("/{id}")
    public Artista obtenerArtistaPorId(@PathVariable Long id) {
        return artistaService.obtenerArtistaPorId(id);
    }

    @GetMapping("/genero/{genero}")
    public List<Artista> obtenerArtistasPorGenero(@PathVariable String genero) {
        Genero generoEnum = Genero.fromString(genero);
        return artistaService.obtenerArtistasPorGenero(generoEnum);
    }

    @GetMapping("/nacionalidad/{nacionalidad}")
    public List<Artista> obtenerArtistasPorNacionalidad(@PathVariable String nacionalidad) {
        return artistaService.obtenerArtistasPorNacionalidad(nacionalidad);
    }

    @GetMapping("/instrumento/{instrumento}")
    public List<Artista> obtenerArtistasPorInstrumento(@PathVariable String instrumento) {
        return artistaService.obtenerArtistasPorInstrumento(instrumento);
    }

    @GetMapping("/edad/{edad}")
    public List<Artista> obtenerArtistasPorEdad(@PathVariable int edad) {
        return artistaService.obtenerArtistasPorEdad(edad);
    }

    @GetMapping("/cantidad-canciones/{cantidadCanciones}")
    public List<Artista> obtenerArtistasPorCantidadDeCanciones(@PathVariable int cantidadCanciones) {
        return artistaService.obtenerArtistasPorCantidadDeCanciones(cantidadCanciones);
    }

    @GetMapping("/vivos")
    public List<Artista> obtenerArtistasVivos() {
        return artistaService.obtenerArtistasVivos();
    }

    @GetMapping("/fallecidos")
    public List<Artista> obtenerArtistasFallecidos() {
        return artistaService.obtenerArtistasFallecidos();
    }

    @GetMapping
    public List<Artista> obtenerTodosLosArtistas() {
        return artistaService.obtenerTodosLosArtistas();
    }
}

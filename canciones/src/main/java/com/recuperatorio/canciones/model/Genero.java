package com.recuperatorio.canciones.model;

public enum Genero {
    ROCK,
    POP,
    JAZZ,
    CLASSICAL,
    HIPHOP,
    ELECTRONIC;

    public static Genero fromString(String genero) {
        try {
            return Genero.valueOf(genero.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Género no válido: " + genero);
        }
    }
}

package com.tt1.test;

import java.io.Serializable;
import java.time.LocalDate;

public class ToDo implements Serializable {
    private String nombre;
    private String descripción;
    private LocalDate fechaLimite;
    private boolean completado;

    public ToDo() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo(String nombre, String descripcion, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public LocalDate getFechaLimite() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public String getDescripción() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setCompletado(boolean completado) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setDescripción(String descripción) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean isCompletado() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

}

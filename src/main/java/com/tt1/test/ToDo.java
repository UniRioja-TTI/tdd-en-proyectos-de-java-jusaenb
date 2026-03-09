package com.tt1.test;

import java.io.Serializable;
import java.time.LocalDate;

/**
    * Representa una tarea individual en el sistema.
    * Contiene información sobre el nombre, descripción, fecha límite y estado de ejecución.
 */
public class ToDo implements Serializable {
    private String nombre;
    private String descripción;
    private LocalDate fechaLimite;
    private boolean completado;

    /** Constructor por defecto de la tarea. */
    public ToDo() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**
     * Constructor con los campos de la tarea.
     * @param nombre El nombre de la tarea.
     * @param descripcion Detalle de lo que se debe hacer.
     * @param fechaLimite Fecha máxima para finalizar la tarea.
     */
    public ToDo(String nombre, String descripcion, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @return La fecha límite de la tarea. */
    public LocalDate getFechaLimite() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @return El detalle de la tarea. */
    public String getDescripción() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /** @return El nombre de la tarea. */
    public String getNombre() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param completado El nuevo estado de la tarea. */
    public void setCompletado(boolean completado) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param descripción El nuevo texto descriptivo. */
    public void setDescripción(String descripción) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param fechaLimite Nueva fecha de vencimiento. */
    public void setFechaLimite(LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param nombre El nuevo nombre de la tarea. */
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @return true si la tarea ya ha sido marcada como completada. */
    public boolean isCompletado() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

}

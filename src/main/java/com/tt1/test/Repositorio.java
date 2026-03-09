package com.tt1.test;

import java.util.List;

/**
 * Gestiona el acceso a datos y la comunicación con la base de datos (DBStub).
 */
public class Repositorio {
    private DBStub db;
    /**
     * Constructor de la clase.
     * @param db Instancia de la base de datos para realizar operaciones.
     */
    public Repositorio(DBStub db){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**
     * Busca una tarea específica por su nombre.
     * @param nombre Nombre exacto a buscar.
     * @return El objeto ToDo si se encuentra, null en caso contrario.
     */
    public ToDo buscarToDo(String nombre){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param todo El objeto a actualizar como completado en la base de datos.
     * @return true si tuvo éxito la actualización.
     */
    public boolean marcarCompletado(ToDo todo){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param todo El objeto ToDo que se desea guardar. */
    public void guardarToDo(ToDo todo){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param email Email que se desea almacenar en la agenda. */
    public void guardarEmail(String email){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}

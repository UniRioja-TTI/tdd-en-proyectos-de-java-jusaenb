package com.tt1.test;

import java.util.List;
import java.util.Set;

/**
 * Componente de simulación de base de datos en memoria.
 * Proporciona métodos CRUD para la gestión de objetos ToDo y almacenamiento de contactos.
 */
public class DBStub {
    public List<ToDo> todos;
    public Set<String> agendaEmails;

    /** Constructor por defecto de la base de datos simulada. */
    public DBStub() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param todo Tarea que se desea insertar en el sistema. */
    public void agregarToDo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param todo Tarea existente con datos actualizados para persistir. */
    public void actualizarToDo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /** @param todo Tarea que se desea eliminar definitivamente del sistema. */
    public void eliminarToDo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**@return Lista de tareas almacenadas*/
    public List<ToDo> listarToDos() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param email Dirección de correo que se desea registrar en la base de datos. */
    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /** @return Conjunto de todos los correos registrados, sin duplicados. */
    public Set<String> listarEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}

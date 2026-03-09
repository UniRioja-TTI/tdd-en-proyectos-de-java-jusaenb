package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

/**
 * Capa de lógica de negocio que coordina las operaciones entre el repositorio y los servicios externos.
 * Gestiona la creación, actualización y notificaciones de tareas.
 */
public class Servicio {
    private Repositorio repo;
    private MailerStub mailer;

    /**
     * Constructor con los campos del servicio.
     * @param repo Repositorio de persistencia de datos.
     * @param mailer Servicio para el envío de correos electrónicos.
     */
    public Servicio(Repositorio repo, MailerStub mailer) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**
     * Registra una nueva tarea en el sistema.
     * @param nombre Nombre de la tarea.
     * @param fechaLimite Cuándo debe estar terminada.
     */
    public void crearToDo(String nombre, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param email Dirección de correo a añadir a la lista de notificaciones. */
    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @param nombre Marca como finalizada la tarea con este nombre. */
    public void marcarToDoCompletado(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** @return La lista con todos los objetos de tarea cuyo estado es incompleto. */
    public List<ToDo> listarToDosPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /** Envía alertas por email sobre el estado de las tareas */
    private void enviarAlertas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}

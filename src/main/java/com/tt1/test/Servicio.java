package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private Repositorio repo;
    private MailerStub mailer;

    public Servicio(Repositorio repo, MailerStub mailer) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void crearToDo(String nombre, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarToDoCompletado(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> listarToDosPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    private void enviarAlertas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}

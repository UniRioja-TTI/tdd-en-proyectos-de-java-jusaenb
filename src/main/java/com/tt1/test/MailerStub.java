package com.tt1.test;

/**
 * Simulador de servicio de envío de correos electrónicos.
 * Se utiliza para gestionar las comunicaciones de salida del sistema hacia los usuarios.
 */
public class MailerStub {
    /**
     * Realiza el envío de un mensaje de texto a una dirección de correo específica.
     * @param email Dirección de correo electrónico del destinatario.
     * @param mensaje Cuerpo del mensaje a enviar.
     * @return true si el proceso de envío se inició correctamente, false en caso contrario.
     */
    public boolean enviarEmail(String email, String mensaje) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}

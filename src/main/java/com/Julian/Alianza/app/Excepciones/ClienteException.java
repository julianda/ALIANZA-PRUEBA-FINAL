package com.Julian.Alianza.app.Excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * excepcion cuando no encuentra un cliente
 * lanza un mensaje "NOT FOUND"
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ClienteException extends RuntimeException {
    /**
     * Id o identificador de la clase serializable
     */
    private static final long serialVersionID = 1L;

    public ClienteException(String mensaje){
        super(mensaje);
    }
}


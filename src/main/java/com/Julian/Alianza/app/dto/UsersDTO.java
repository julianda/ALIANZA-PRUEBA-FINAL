package com.Julian.Alianza.app.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * objeto de transferiancia de datos a nuestra aplicacion
 * y aca es donde decidimos que atribustos vamos a mostrar
 * para nuestra aplicacion.
 */
@Data
public class UsersDTO implements Serializable {
    private Long id;
    private String Shared_key;
    private String Business_id;
    private String Email;
    private String phone;
    private String Data_added;

}

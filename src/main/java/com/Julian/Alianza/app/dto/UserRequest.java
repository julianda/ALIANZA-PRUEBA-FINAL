package com.Julian.Alianza.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * usuario de tipo requeest el cual tiene los atribuetos
 *con el cual hacemos la solicitud a nuestra base de datos.
 */
public class UserRequest {
    @JsonProperty("shared_key")
    private Long id;
    @JsonProperty("Business_id")
    private String Shared_key;
    @JsonProperty("Email")
    private String Business_id;
    @JsonProperty("phone")
    private String Email;
    @JsonProperty("Data added")
    private String phone;

}

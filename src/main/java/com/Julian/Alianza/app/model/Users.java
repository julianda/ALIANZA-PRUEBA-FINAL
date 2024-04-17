package com.Julian.Alianza.app.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Clase de tipo Entity cliente  que contiene
 * la informacion de cada persona para cargar
 * a una Tabla en la Base de datos ,Sse carga el valor
 * del Id de forma Automatica.
 *
 */
@Builder
@Data
@Entity
@Table(name="Clients")
public class Users implements Serializable {  //se implementa clase como serializable.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Shared_key",length = 60,nullable = false)
    private String Shared_key;
    @Column(name="Busines_id",length = 60,nullable = false)
    private String Business_id;
    @Column(name="Email",length = 60,nullable = false,unique = true)
    private String Email;
    @Column(name="Phone",length = 20,nullable = false)
    private String phone;
    @Column(name="Data_added",length = 30,nullable = false)
    private String Data_added;

    /**
     * constructor de Beans tipo cliente
     * con sus respectivos Getters and Setters
     */
    }


package com.Julian.Alianza.app.utilidades;

import org.modelmapper.ModelMapper;

/**
 * metodo helper que nos ayuda a mapear o convertir
 * de un tipo de clase a otro tipo de clase.
 */
public class MHelpers {
    public static ModelMapper modelMapper(){
        return new ModelMapper();
    }
}

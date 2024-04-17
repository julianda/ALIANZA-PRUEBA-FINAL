package com.Julian.Alianza.app.service.Imple;

import com.Julian.Alianza.app.dto.UserRequest;
import com.Julian.Alianza.app.dto.UsersDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * implementacion de nuestros metodos que vamos a utilizar
 * sobre la tabla creada en nuestra base de datos.
 */
@Service
public interface IUsersService {

    List<UsersDTO> findAll();
    UsersDTO findByShared_Key(String shared_key); //throws ClienteException;
    UsersDTO findByID(Long id);  //throws ClienteException;
    void saveUpdate(UserRequest user);
    void saveAll(List<UserRequest> user);
    void deleteById(Long id);

}

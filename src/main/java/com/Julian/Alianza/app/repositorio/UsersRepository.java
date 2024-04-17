package com.Julian.Alianza.app.repositorio;



import com.Julian.Alianza.app.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * implementacion de la persistencia a la base de datos
 * donde se puede poner todos los queruy que se realizan sobre nuestra
 * tabla Mapeada.
 * @Author JULIAN D CANDAMIL
 */
@Repository
public interface UsersRepository extends CrudRepository<Users,Long> {

    @Transactional(readOnly = true)
    Optional<Users> findByShared_key(String shared_key);
}

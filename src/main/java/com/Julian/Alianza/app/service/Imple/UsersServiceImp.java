package com.Julian.Alianza.app.service.Imple;


import com.Julian.Alianza.app.dto.UserRequest;
import com.Julian.Alianza.app.dto.UsersDTO;
import com.Julian.Alianza.app.model.Users;
import com.Julian.Alianza.app.repositorio.UsersRepository;
import com.Julian.Alianza.app.utilidades.MHelpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * servicio que implementa todos los metodos a traves de la interfaz
 * y con la la ayuda de la clase repository realizamos la persistencia
 * en la base de datos.
 */
@Service
@Component
public class UsersServiceImp implements IUsersService {
    @Autowired
    private  UsersRepository usersRepository;
    @Autowired
    @Qualifier("userRepository")
    public void setUserRepository(UsersRepository usersRepository){
        this.usersRepository=usersRepository;
    }
    @Override
    public List<UsersDTO> findAll() {
        List<UsersDTO> DTO=new ArrayList<>() ;
        Iterable<Users> users = this.usersRepository.findAll();
      for(Users user :users)
        {
          UsersDTO usersDTO =MHelpers.modelMapper().map(user, UsersDTO.class);
          DTO.add(usersDTO);
        }
        return DTO;
    }
    @Override
    public UsersDTO findByShared_Key(String Shared_key)  {
        Optional<Users> users = this.usersRepository.findByShared_key(Shared_key);
        if (!users.isEmpty()) {
           // return null;
            }
        return MHelpers.modelMapper().map(users.get(),UsersDTO.class);
        }
    @Override
    public UsersDTO findByID(Long id)  {
        Optional<Users> users = this.usersRepository.findById(id);
        if (!users.isEmpty()) {
            return null;
        }
        return MHelpers.modelMapper().map(users.get(), UsersDTO.class);
     }
    @Override
    public void saveUpdate(UserRequest user) {
        Users users =  MHelpers.modelMapper().map(user, Users.class);
        this.usersRepository.save(users);
     }
    @Override
    public void saveAll(List<UserRequest> users) {

        List<Users> u=new ArrayList<>();
        for(UserRequest user:users){
            Users us =(MHelpers.modelMapper().map(user, Users.class));
            u.add(us);
        }
        this.usersRepository.saveAll(u);
    }
    @Override
    public void deleteById(Long id) {

        this.usersRepository.deleteById(id);
       }
    private UsersDTO convertClientestoDTO (Users users){
        return MHelpers.modelMapper().map(users, UsersDTO.class);

    }
}


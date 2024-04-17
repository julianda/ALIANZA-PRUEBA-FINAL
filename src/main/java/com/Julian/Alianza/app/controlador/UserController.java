package com.Julian.Alianza.app.controlador;


import com.Julian.Alianza.app.dto.UserRequest;
import com.Julian.Alianza.app.service.Imple.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import static java.lang.Boolean.TRUE;

@Service
@RestController
@RequestMapping(path="/users")
/**
 * contralador donde se relaizan solitudes Http para exponer nuestros
 * servicios de crear,listar y guardar un cliente.
 */
public class UserController {
    @Autowired
    private UsersServiceImp usersServiceImp;
    @GetMapping(value = "/All", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index() {
        return ResponseEntity.ok(this.usersServiceImp.findAll());
    }
    @GetMapping(value = "/by/{shared_key}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findByshared_key(@PathVariable("shared_key") String shared_key){
        return ResponseEntity.ok(this.usersServiceImp.findByShared_Key(shared_key));
    }
    @PostMapping(value = "/save" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveUpdate(@RequestBody UserRequest request){

        this.usersServiceImp.saveUpdate(request);
        return ResponseEntity.ok(TRUE);
    }

}
package com.microservices.user.controllers;

import com.microservices.user.dto.UserDto;
import com.microservices.user.models.UserModel;
import com.microservices.user.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    UserServices userServices;

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserDto userDto){
        var userModel = new UserModel();
        //O método BeanUtils.copyProperties(source, target) é utilizado para copiar propriedades de um objeto para outro em Java.
        BeanUtils.copyProperties(userDto, userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userServices.saveUser(userModel));
    }
}

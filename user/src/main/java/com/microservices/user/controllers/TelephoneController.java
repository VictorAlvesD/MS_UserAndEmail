package com.microservices.user.controllers;

import com.microservices.user.dto.TelephoneDto;
import com.microservices.user.dto.UserDto;
import com.microservices.user.models.TelephoneModel;
import com.microservices.user.models.UserModel;
import com.microservices.user.services.TelephoneService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TelephoneController {
    @Autowired
    TelephoneService telephoneService;

    @PostMapping("/telephones")
    public ResponseEntity<TelephoneModel> saveTelephones(@RequestBody @Valid TelephoneDto telephoneDto){
        var telephoneModel = new TelephoneModel();
        //O método BeanUtils.copyProperties(source, target) é utilizado para copiar propriedades de um objeto para outro em Java.
        BeanUtils.copyProperties(telephoneDto, telephoneModel);
        telephoneModel.toString();
        return ResponseEntity.status(HttpStatus.CREATED).body(telephoneService.saveTelephone(telephoneModel));

    }
}

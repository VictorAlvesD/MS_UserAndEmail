package com.microservices.user.controllers;

import com.microservices.user.dto.AddressDto;
import com.microservices.user.models.AddressModel;
import com.microservices.user.services.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AdressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/address")
    public ResponseEntity<AddressModel> saveAddress(@RequestBody @Valid AddressDto addressDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(addressService.saveAddress(addressDto));
    }
}

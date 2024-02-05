package com.microservices.user.services;

import com.microservices.user.models.AdressModel;
import com.microservices.user.repositories.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressService {
    @Autowired
    AdressRepository adressRepository;

    public AdressModel saveAdress(AdressModel adressModel){
        return adressRepository.save(adressModel);
    }
}

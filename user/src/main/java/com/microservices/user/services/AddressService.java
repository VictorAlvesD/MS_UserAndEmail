package com.microservices.user.services;

import com.microservices.user.models.AddressModel;
import com.microservices.user.repositories.AdressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AdressRepository adressRepository;

    @Transactional
    public AddressModel saveAddress(AddressModel addressModel){
        return adressRepository.save(addressModel);
    }
}

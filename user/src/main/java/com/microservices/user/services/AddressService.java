package com.microservices.user.services;

import com.microservices.user.dto.AddressDto;
import com.microservices.user.models.AddressModel;
import com.microservices.user.repositories.AdressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AdressRepository adressRepository;

    @Transactional
    public AddressModel saveAddress(AddressDto addressDto){
        AddressModel addressModel = new AddressModel();
        BeanUtils.copyProperties(addressDto, addressModel);
        return adressRepository.save(addressModel);
    }
}

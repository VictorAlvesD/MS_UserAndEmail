package com.microservices.user.services;

import com.microservices.user.dto.TelephoneDto;
import com.microservices.user.models.TelephoneModel;
import com.microservices.user.models.UserModel;
import com.microservices.user.repositories.TelephoneRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelephoneService {
    @Autowired
    TelephoneRepository telephoneRepository;

    @Transactional
    public TelephoneModel saveTelephone(TelephoneModel telephoneModel) {
        return telephoneRepository.save(telephoneModel);
    }
}

package com.microservices.user.services;

import com.microservices.user.dto.TelephoneDto;
import com.microservices.user.models.TelephoneModel;
import com.microservices.user.models.UserModel;
import com.microservices.user.repositories.TelephoneRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelephoneService {
    @Autowired
    TelephoneRepository telephoneRepository;

    @Transactional
    public TelephoneModel saveTelephone(TelephoneDto telephoneDto) {
        var telephoneModel = new TelephoneModel();
        //O método BeanUtils.copyProperties(source, target) é utilizado para copiar propriedades de um objeto para outro em Java.
        BeanUtils.copyProperties(telephoneDto, telephoneModel);
        telephoneModel.toString();
        return telephoneRepository.save(telephoneModel);
    }
}

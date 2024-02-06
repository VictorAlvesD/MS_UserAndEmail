package com.microservices.user.services;

import com.microservices.user.dto.TelephoneDto;
import com.microservices.user.dto.UserDto;
import com.microservices.user.models.TelephoneModel;
import com.microservices.user.models.UserModel;
import com.microservices.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public UserModel saveUser(UserDto userDto) {
        var userModel = new UserModel();

        //Lista de Telefones:
        if (!userDto.telephones().isEmpty()) {
            // Mapear os telefones DTO para modelos de telefones
            List<TelephoneModel> telephoneModelList = userDto.telephones().stream()
                     .map(tel -> {
                                TelephoneModel telephone = new TelephoneModel();
                                telephone.setNumber(tel.number());
                                telephone.setDdd(tel.ddd());
                                return telephone;
                            }
                    ).collect(Collectors.toList());
            // Configurar a lista de telefones do userModel
            userModel.setTelephones(telephoneModelList);
        } else {
            // Se a lista de telefones estiver vazia, definimos como null
            userModel.setTelephones(null);
        }

        //O método BeanUtils.copyProperties(source, target) é utilizado para copiar propriedades de um objeto para outro em Java.
        BeanUtils.copyProperties(userDto, userModel);
        return userRepository.save(userModel);
    }
}

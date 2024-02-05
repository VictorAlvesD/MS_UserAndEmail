package com.microservices.user.repositories;

import com.microservices.user.models.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdressRepository extends JpaRepository<AddressModel, UUID> {
}

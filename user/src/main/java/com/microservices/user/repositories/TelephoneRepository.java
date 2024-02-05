package com.microservices.user.repositories;

import com.microservices.user.models.TelephoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TelephoneRepository extends JpaRepository<TelephoneModel, UUID> {
}

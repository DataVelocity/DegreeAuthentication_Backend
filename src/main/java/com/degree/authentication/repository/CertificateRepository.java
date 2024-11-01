package com.degree.authentication.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.degree.authentication.model.Certificate;

import java.util.Optional;

public interface CertificateRepository extends MongoRepository<Certificate, String> {
    Optional<Certificate> findByNameAndRegistrationNumberAndCertificateNumber(String name, String registrationNumber, String certificateNumber);
}

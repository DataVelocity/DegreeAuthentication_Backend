package com.degree.authentication.service;


//import com.degree.authentication.model.Certificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.degree.authentication.repository.CertificateRepository;

@Service
public class CertificateService {
    @Autowired
    private CertificateRepository certificateRepository;

    public boolean verifyCertificate(String name, String registrationNumber, String certificateNumber) {
        return certificateRepository.findByNameAndRegistrationNumberAndCertificateNumber(name, registrationNumber, certificateNumber).isPresent();
    }
}

package com.degree.authentication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.degree.authentication.service.CertificateService;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/certificates")
public class CertificateController {
    @Autowired
    private CertificateService certificateService;

    @PostMapping("/verify")
    public Map<String, String> verifyCertificate(@RequestBody Map<String, String> payload) {
        String name = payload.get("name");
        String registrationNumber = payload.get("registrationNumber");
        String certificateNumber = payload.get("certificateNumber");

        boolean isValid = certificateService.verifyCertificate(name, registrationNumber, certificateNumber);
        Map<String, String> response = new HashMap<>();
        response.put("status", isValid ? "valid" : "invalid");
        response.put("message", isValid ? "Validate Successfully!" : "Not Valid.");
        return response;
    }
}

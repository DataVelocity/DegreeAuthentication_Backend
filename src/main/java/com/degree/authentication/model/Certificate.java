package com.degree.authentication.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "certification")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Certificate {
    @Id
    private String id;
    private String name;
    private String registrationNumber;
    private String certificateNumber;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	
	public Certificate(String id, String name, String registrationNumber, String certificateNumber) {
		super();
		this.id = id;
		this.name = name;
		this.registrationNumber = registrationNumber;
		this.certificateNumber = certificateNumber;
	}
    
    
}

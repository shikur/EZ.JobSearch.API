package com.Ez.JobSearch.JobSearch.model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;;
@Document(collection ="clientcvs")
public class ClientCV {
	
	/*
	 * @Transient public static final String SEQUENCE_NAME = "clientcvcollec";
	 */
	
	@Id
	private String cvId;
	
	private String firstName;
	private String lastName;
	private String addiionalName;
	private String pronouns;
	
	private String headLine ;
	private String currentPositions;
	private String indutry;
	private String locations;
	
	private String postalcode;
	private String city;
	private List<ContactInformation> contactInformation;
	private List<Education> education;
	private List<Position> position;
	private List<Client> client;
	
	
	public List<ContactInformation> getContactInformation() {
		return contactInformation;
	}



	public void setContactInformation(List<ContactInformation> contactInformation) {
		this.contactInformation = contactInformation;
	}



	public List<Education> getEducation() {
		return education;
	}



	public void setEducation(List<Education> education) {
		this.education = education;
	}



	public List<Position> getPosition() {
		return position;
	}



	public void setPosition(List<Position> position) {
		this.position = position;
	}



	public List<Client> getClient() {
		return Client;
	}



	public void setClient(List<Client> client) {
		Client = client;
	}

	private List<Client> Client;
	
	
	
	
	public String getCvId() {
		return cvId;
	}
	
	
	
	public void setCvId(String cvId) {
		this.cvId = cvId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddiionalName() {
		return addiionalName;
	}

	public void setAddiionalName(String addiionalName) {
		this.addiionalName = addiionalName;
	}

	public String getPronouns() {
		return pronouns;
	}

	public void setPronouns(String pronouns) {
		this.pronouns = pronouns;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getCurrentPositions() {
		return currentPositions;
	}

	public void setCurrentPositions(String currentPositions) {
		this.currentPositions = currentPositions;
	}

	public String getIndutry() {
		return indutry;
	}

	public void setIndutry(String indutry) {
		this.indutry = indutry;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ClientCV [cvId=" + this.cvId + ", lastName=" + this.lastName + "]";
	}
	
	

}

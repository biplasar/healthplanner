package com.ibm.healthplanner.spring.bean;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
@SuppressWarnings("serial")
@Document(collection = "user")
public class User  extends BaseEntity{
	@JsonProperty("patientName")
	private PatientName name = null;
	@JsonProperty("postalAddress")
	private PostalAddress address = null;
	private String dateOfBirth;
	private String mailId;
	private String phone;
	@JsonProperty("maritalStatus")
	private String maritalStatus = null;
	private List<String> medHistory;;
	public User(){
	}

	
	  public User(PatientName name, PostalAddress address, String dateOfBirth,
	  String mailId, String phone, String maritalStatus, List<String> medHistory ){
		  this.name = name; 
		  this.address = address; 
		  this.dateOfBirth = dateOfBirth;
		  this.mailId = mailId; 
		  this.phone = phone; 
		  this.maritalStatus = maritalStatus;
		  this.medHistory = medHistory; 
	  } 
	  public PatientName getName() { 
		  	return name; 
	  }
	  public void setName(PatientName name) {
	  
		  System.out.println("The name is : "+ name); 
		  this.name = name; 
	  } 
	  public PostalAddress getAddress() { 
		  return address; 
	  } 
	  public void setAddress(PostalAddress address) {
	  
		  System.out.println("The address is : "+ address); 
		  this.address = address; 
	  }
	 
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		System.out.println("The DOB is : "+ dateOfBirth);
		this.dateOfBirth = dateOfBirth;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		System.out.println("The Mail ID is : "+ mailId);
		this.mailId = mailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		System.out.println("The phone no is : "+ phone);
		this.phone = phone;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		System.out.println("The marital status is : "+ maritalStatus);
		this.maritalStatus = maritalStatus;
	}
	public List<String> getMedHistory() {
		return medHistory;
	}
	public void setMedHistory(List<String> medHistory) {
		System.out.println("The medical history is : "+ medHistory.toString());
		this.medHistory = medHistory;
	}
}
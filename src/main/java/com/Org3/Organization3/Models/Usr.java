package com.Org3.Organization3.Models;


import jakarta.persistence.Column;

//import javax.persistence.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "usrdtls")
public class Usr {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	@Column(nullable = false,unique = true)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
//	@Column(nullable = false)
//	private String UserEmail;
	
	@Column(nullable = false)
	private String Userid;
	

}

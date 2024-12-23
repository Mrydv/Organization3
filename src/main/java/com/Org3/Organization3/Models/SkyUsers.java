package com.Org3.Organization3.Models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "skyusers5")
public class SkyUsers implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String Id;
	
	
	@Column(unique = true)
	private String  sky_users_name;
	
	
	@Column()
	private String sky_user_password;
	
	@Column(nullable = false, length=120, unique = true)  //Also you can add this for only unique value fot email unique = true
	private String sky_user_email;
	

}

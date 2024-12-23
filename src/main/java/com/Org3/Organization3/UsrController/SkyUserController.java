package com.Org3.Organization3.UsrController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Org3.Organization3.Models.SkyUsers;
import com.Org3.Organization3.UsrServices.SkyUsersSerrvices;


@RestController
@RequestMapping("/SkyUsers")
public class SkyUserController {
	
	@Autowired
	private SkyUsersSerrvices skyUsersSerrvices;
	

	//1st Simple get method
//	@GetMapping("/Get")
//	public Iterable<SkyUsers> getAllUsers(){
//	return skyUsersSerrvices.getAllSkyUsers();
//	}
//	
	//2nd Robust and updated getmethod
	@GetMapping("/RobustGet")
	public @ResponseBody ResponseEntity<?> getAllUsersDtls(){
		Iterable<SkyUsers> skyusrLstObj= skyUsersSerrvices.getAllSkyUsers();
		if(skyusrLstObj!=null) {
			return new ResponseEntity<>(skyusrLstObj, HttpStatus.OK);
		}else {
		    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	//3rd Simple Post Method
//	@PostMapping("/Post")
//	public void createSkyUsers(@RequestBody SkyUsers skyUsers) {
//		skyUsersSerrvices.createNewSkyUsers(skyUsers);
//	}
//	
	//4th Robust Post Method
	@PostMapping("/RobustPost")
	public @ResponseBody  ResponseEntity<?> createNewSkyUsers(@RequestBody SkyUsers skyUsers) {
		if(skyUsers!=null) {
			skyUsersSerrvices.createNewSkyUsers(skyUsers);
			return new ResponseEntity<>(skyUsers, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
 }
}

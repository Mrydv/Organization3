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

import com.Org3.Organization3.Models.Usr;
import com.Org3.Organization3.UsrServices.usrService;

@RestController
@RequestMapping("/user")
public class UsrController {
	
	@Autowired
	private usrService usrsrvc;
	
	//Sim Get endpoint
//	@GetMapping("/Dtls")
//	public Iterable<Usr> getAllUse(){
//		return usrsrvc.getAllUsrs();
//	}
	
	
	@GetMapping("/Dtls")
	public @ResponseBody ResponseEntity<?> getAllUsr(){
		Iterable<Usr> usrlstObj= (Iterable<Usr>) usrsrvc.getAllUsrs();
		if(usrlstObj!=null) {
			return new ResponseEntity<>(usrlstObj, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	//Sim Post endpoint
//	@PostMapping("/post")
//	public void createUsr(@RequestBody Usr usr) {
//		usrsrvc.createUsr(usr);
//	}
	
	
	
	@PostMapping("/post")
	public @ResponseBody ResponseEntity<?> createUsr(@RequestBody Usr usr) {
		if(usr!=null) {
			 usrsrvc.createUsr(usr);
			return new ResponseEntity<>(usr, HttpStatus.CREATED);  
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	

}

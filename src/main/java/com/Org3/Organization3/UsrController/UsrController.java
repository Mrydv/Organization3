package com.Org3.Organization3.UsrController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Org3.Organization3.Models.Usr;
import com.Org3.Organization3.UsrServices.usrService;

@RestController
@RequestMapping("/user")
public class UsrController {
	
	@Autowired
	private usrService usrsrvc;
	
	
	@GetMapping("/Dtls")
	public Iterable<Usr> getAllUsr(){
		return usrsrvc.getAllUsrs();
	}
	
	@PostMapping("/post")
	public void createUsr(@RequestBody Usr usr) {
		usrsrvc.createUsr(usr);
	}

}

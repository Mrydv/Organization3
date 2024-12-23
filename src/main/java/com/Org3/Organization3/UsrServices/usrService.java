package com.Org3.Organization3.UsrServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Org3.Organization3.Models.Usr;
import com.Org3.Organization3.Repositories.UsrRepository;

@Service
public class usrService {
	
	@Autowired
	private UsrRepository usrRepository;
	
	public Iterable<Usr> getAllUsrs(){
		return usrRepository.findAll();
	}
	
	public void createUsr(Usr usr) {
		usrRepository.save(usr);
	}

}

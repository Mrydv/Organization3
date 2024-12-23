package com.Org3.Organization3.UsrServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Org3.Organization3.Models.SkyUsers;
import com.Org3.Organization3.Repositories.SkyUserRepository;

@Service
public class SkyUsersSerrvices {
	
	@Autowired
	private SkyUserRepository skyUserRepository;
	
	
public Iterable<SkyUsers> getAllSkyUsers(){
	return skyUserRepository.findAll();
}


public void createNewSkyUsers(SkyUsers skyUsers) {
//	if(skyUserRepository.existsById(skyUsers.getId())) throw new RuntimeException("This ID Aiready Exits |~_~|:(:(");if(skyUserRepository.existsById(skyUsers.getId())) throw new RuntimeException("This ID Aiready Exits |~_~|:(:(");
	if(skyUserRepository.findByUserEmail(skyUsers.getSky_user_email())!=null) throw new RuntimeException("Email Already exits");
	System.out.println(skyUserRepository.save(skyUsers) + "User Created Successfully !._.!:):):)");
}

}

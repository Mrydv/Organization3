package com.Org3.Organization3.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Org3.Organization3.Models.SkyUsers;

@Repository
public interface SkyUserRepository extends CrudRepository<SkyUsers, String>{

//	public List<SkyUsers> findAll(SkyUsers skyUsers);
	public  List<SkyUsers> findByUserEmail(String sky_user_email);

}

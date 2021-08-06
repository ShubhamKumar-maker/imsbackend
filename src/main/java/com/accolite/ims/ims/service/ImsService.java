package com.accolite.ims.ims.service;

import java.util.List;

import com.accolite.ims.ims.modles.Admin;

public interface ImsService {
	
	public Admin save(Admin admin);
	List<Admin> fetchAdmin();

}

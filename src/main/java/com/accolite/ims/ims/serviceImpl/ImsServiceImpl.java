package com.accolite.ims.ims.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accolite.ims.ims.dao.AdminDao;
import com.accolite.ims.ims.modles.Admin;
import com.accolite.ims.ims.service.ImsService;

@Service
public class ImsServiceImpl implements ImsService {
	
	@Autowired
	private AdminDao admindao;

	@Override
	public Admin save(Admin admin) {
		return admindao.saveAdmin(admin);
	}

	@Override
	public List<Admin> fetchAdmin() {
		return admindao.getall();
		
	}

	
}

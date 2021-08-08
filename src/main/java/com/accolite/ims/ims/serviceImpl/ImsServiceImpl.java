package com.accolite.ims.ims.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accolite.ims.ims.dao.JobOpeningDao;
import com.accolite.ims.ims.modles.jobOpenings;
import com.accolite.ims.ims.service.ImsService;

@Service
public class ImsServiceImpl implements ImsService {
	
	@Autowired
	private JobOpeningDao admindao;

	@Override
	public jobOpenings save(jobOpenings admin) {
		return admindao.saveAdmin(admin);
	}

	@Override
	public List<jobOpenings> fetchAdmin() {
		return admindao.getall();
		
	}

	
}

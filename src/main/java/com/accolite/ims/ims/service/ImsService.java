package com.accolite.ims.ims.service;

import java.util.List;

import com.accolite.ims.ims.modles.jobOpenings;

public interface ImsService {
	
	public jobOpenings save(jobOpenings admin);
	List<jobOpenings> fetchAdmin();

}

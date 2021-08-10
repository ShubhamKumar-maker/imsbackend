package com.accolite.ims.ims.service;

import java.util.List;

import com.accolite.ims.ims.modles.PanelEvents;
import com.accolite.ims.ims.modles.jobOpenings;

public interface ImsService {
	
	public jobOpenings save(jobOpenings admin);
	public List<jobOpenings> fetchAdmin();
	public boolean findbyId(String username);
	public List<PanelEvents> getallevent(String panelid);

}

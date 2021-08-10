package com.accolite.ims.ims.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accolite.ims.ims.dao.EmployeeDao;
import com.accolite.ims.ims.dao.JobOpeningDao;
import com.accolite.ims.ims.dao.Paneldetails;
import com.accolite.ims.ims.modles.Employee;
import com.accolite.ims.ims.modles.PanelEvents;
import com.accolite.ims.ims.modles.jobOpenings;
import com.accolite.ims.ims.service.ImsService;

@Service
public class ImsServiceImpl implements ImsService {
	
	@Autowired
	private JobOpeningDao admindao;
	
	@Autowired
	private EmployeeDao employee;
	
	@Autowired 
	private Paneldetails paneldetails;

	@Override
	public jobOpenings save(jobOpenings admin) {
		return admindao.saveAdmin(admin);
	}

	@Override
	public List<jobOpenings> fetchAdmin() {
		return admindao.getall();
		
	}

	@Override
	public boolean findbyId(String username) {
		List<Employee> result=employee.findEMployee();
		return result.stream().anyMatch(x->{return x.getUsername().equals(username);});
	}

	@Override
	public List<PanelEvents> getallevent(String panelid) {
		
		return paneldetails.getPanelAllEvents(panelid);
	}

	
}

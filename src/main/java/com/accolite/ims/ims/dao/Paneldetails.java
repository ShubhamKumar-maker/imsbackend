package com.accolite.ims.ims.dao;

import java.util.List;

import com.accolite.ims.ims.modles.PanelAvailabilityDetails;

public interface Paneldetails {
	List<PanelAvailabilityDetails>getdata(String skill,int maxlevel);

}

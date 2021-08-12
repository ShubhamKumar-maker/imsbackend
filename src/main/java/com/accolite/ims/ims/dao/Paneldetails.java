package com.accolite.ims.ims.dao;

import java.util.List;

import com.accolite.ims.ims.modles.PanelAvailabilityDetails;
import com.accolite.ims.ims.modles.PanelEvents;

public interface Paneldetails {
	List<PanelAvailabilityDetails>getdata(String skill,int maxlevel);
	public PanelAvailabilityDetails setPanel(PanelAvailabilityDetails details);
	public List<PanelEvents>getPanelAllEvents(String panelId);
	public List<PanelEvents>getPanelFreeSlot(String panelId);
	public boolean deletepanelavailable(long panelavailabilityid);
	

}

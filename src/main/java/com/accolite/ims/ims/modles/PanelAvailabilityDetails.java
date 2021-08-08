package com.accolite.ims.ims.modles;

import java.sql.Date;
import java.sql.Time;

public class PanelAvailabilityDetails {
	
	private String panelId;
	private Date panelavailabledate;
	private Time panelavailabletime;
	private String panelskills;
	private int maxlevel;
	private long panelavailableID;
	
	public String getPanelId() {
		return panelId;
	}
	public void setPanelId(String panelId) {
		this.panelId = panelId;
	}
	public Date getPanelavailabledate() {
		return panelavailabledate;
	}
	public void setPanelavailabledate(Date panelavailabledate) {
		this.panelavailabledate = panelavailabledate;
	}
	public Time getPanelavailabletime() {
		return panelavailabletime;
	}
	public void setPanelavailabletime(Time panelavailabletime) {
		this.panelavailabletime = panelavailabletime;
	}
	public String getPanelskills() {
		return panelskills;
	}
	public void setPanelskills(String panelskills) {
		this.panelskills = panelskills;
	}
	public int getMaxlevel() {
		return maxlevel;
	}
	public void setMaxlevel(int maxlevel) {
		this.maxlevel = maxlevel;
	}
	public long getPanelavailableID() {
		return panelavailableID;
	}
	public void setPanelavailableID(long panelavailableID) {
		this.panelavailableID = panelavailableID;
	}
	
	

}

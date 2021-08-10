package com.accolite.ims.ims.modles;

import java.sql.Date;

public class PanelAvilability {
	private String panelid;
	private Date availableDate;
	private String availableTime;
	public String getPanelid() {
		return panelid;
	}
	public void setPanelid(String panelid) {
		this.panelid = panelid;
	}
	public Date getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	public String getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}
	
	

}

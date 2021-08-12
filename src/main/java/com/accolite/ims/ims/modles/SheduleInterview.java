package com.accolite.ims.ims.modles;

import java.sql.Date;
import java.sql.Time;

public class SheduleInterview {
	
	private String panelID;
	private long candidateID;
	private long skillID;
	private Date interviewDate;
	private String interviewTime;
	private String candidatename;
	private String skill;
	private String panelname;
	public String getPanelID() {
		return panelID;
	}
	public void setPanelID(String panelID) {
		this.panelID = panelID;
	}
	public long getCandidateID() {
		return candidateID;
	}
	public void setCandidateID(long candidateID) {
		this.candidateID = candidateID;
	}
	public long getSkillID() {
		return skillID;
	}
	public void setSkillID(long skillID) {
		this.skillID = skillID;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getInterviewTime() {
		return interviewTime;
	}
	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getPanelname() {
		return panelname;
	}
	public void setPanelname(String panelname) {
		this.panelname = panelname;
	}
	

}

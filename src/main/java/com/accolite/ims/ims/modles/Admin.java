package com.accolite.ims.ims.modles;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Admin {
	private long requirementId;
	private String requirementDetails;
	private Date startDate;
	private Date endDate;
	private int noOfCandidates; 
	private List<AdminSkillSet> adminskillset;
	public long getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(long requirementId) {
		this.requirementId = requirementId;
	}
	public String getRequirementDetails() {
		return requirementDetails;
	}
	public void setRequirementDetails(String requirementDetails) {
		this.requirementDetails = requirementDetails;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getNoOfCandidates() {
		return noOfCandidates;
	}
	public void setNoOfCandidates(int noOfCandidates) {
		this.noOfCandidates = noOfCandidates;
	}
	public List<AdminSkillSet> getAdminskillset() {
		return adminskillset;
	}
	public void setAdminskillset(List<AdminSkillSet> adminskillset) {
		this.adminskillset = adminskillset;
	}
}

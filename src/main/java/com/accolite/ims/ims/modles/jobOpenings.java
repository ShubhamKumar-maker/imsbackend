package com.accolite.ims.ims.modles;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class jobOpenings {
	private long requirementId;
	private String requirementDetails;
	private Date startDate;
	private Date endDate;
	private int noOfCandidates; 
	private long skillId;
	private String skill;
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
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
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	
}

package com.accolite.ims.ims.modles;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminSkillSet {
	private long skillsetId;
	private String skills;
	private long requirementId;
	public long getSkillsetId() {
		return skillsetId;
	}
	public void setSkillsetId(long skillsetId) {
		this.skillsetId = skillsetId;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public long getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(long requirementId) {
		this.requirementId = requirementId;
	}

}

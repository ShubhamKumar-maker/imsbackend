package com.accolite.ims.ims.modles;

public class Candidate {
	private long candidateId;
	private long skill;
	private int currentlevel;
	private String name;
	public long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}
	public long getSkill() {
		return skill;
	}
	public void setSkill(long skill) {
		this.skill = skill;
	}
	public int getCurrentlevel() {
		return currentlevel;
	}
	public void setCurrentlevel(int currentlevel) {
		this.currentlevel = currentlevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}

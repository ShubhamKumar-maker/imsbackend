package com.accolite.ims.ims.dao;

import java.util.List;

import com.accolite.ims.ims.modles.Candidate;

public interface CandidateDao {
	
	List<Candidate>getcandidatebySkill(String skill);

}

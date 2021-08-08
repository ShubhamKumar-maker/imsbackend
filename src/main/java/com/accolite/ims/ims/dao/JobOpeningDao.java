package com.accolite.ims.ims.dao;

import java.util.List;

import com.accolite.ims.ims.modles.SkillSets;
import com.accolite.ims.ims.modles.jobOpenings;

public interface JobOpeningDao {
	jobOpenings saveAdmin(jobOpenings admin);
	List<jobOpenings> getall();
	List<SkillSets> getallSkills();
}

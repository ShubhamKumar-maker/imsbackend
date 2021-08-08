package com.accolite.ims.ims.dao;

import java.util.List;

import com.accolite.ims.ims.modles.SheduleInterview;

public interface SheduleInterviewDao {
	public SheduleInterview savaData(SheduleInterview sheduleinterview);
	public List<SheduleInterview> getallData();

}

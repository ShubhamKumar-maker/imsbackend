package com.accolite.ims.ims.query;

import com.accolite.ims.ims.tableconstant.AdminTableConstants;

public class AdmintableQuery {

	public static final String ADMINSAVEQUERY = "insert into " + AdminTableConstants.JOBOPENINGTB
			+ "(requirementDetails,startDate,endDate,noOfCandidates) values " + "(:"
			+ AdminTableConstants.REQUIREMENTDETAILS + ",:" + AdminTableConstants.STARTDATE + ",:"
			+ AdminTableConstants.ENDDATE + ",:" + AdminTableConstants.NOOFCANDIDATES + ")";

	public static final String ADMINSKLLSETSAVEQUERY = "insert into " + AdminTableConstants.JOBOPENINGSKILLSET
			+ "(skills,requirementId) values (:" + AdminTableConstants.SKILLS + ",:"
			+ AdminTableConstants.REQUIREMENTDETAILS + ")";
	
	
	public static final String FETCHQUERY="select * from "+AdminTableConstants.JOBOPENINGTB;
	public static final String FETCHSKILLQUERY="select * from "+AdminTableConstants.JOBOPENINGSKILLSET+" where requirementId=";
}

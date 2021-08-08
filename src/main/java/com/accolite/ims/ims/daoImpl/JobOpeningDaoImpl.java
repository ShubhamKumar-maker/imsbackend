package com.accolite.ims.ims.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.accolite.ims.ims.dao.JobOpeningDao;
import com.accolite.ims.ims.modles.jobOpenings;
import com.accolite.ims.ims.modles.AdminSkillSet;
import com.accolite.ims.ims.modles.SkillSets;
import com.accolite.ims.ims.query.AdmintableQuery;
import com.accolite.ims.ims.tableconstant.AdminTableConstants;

@Repository
public class JobOpeningDaoImpl implements JobOpeningDao {
	
	 @Autowired
	  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	 
	 @Autowired
	  private JdbcTemplate jdbctemplate;

	@Override
	public jobOpenings saveAdmin(jobOpenings admin) {
		final KeyHolder holder = new GeneratedKeyHolder();
	    String sql=AdmintableQuery.ADMINSAVEQUERY;	  
	    MapSqlParameterSource srcMap = new MapSqlParameterSource();
	    srcMap.addValue(AdminTableConstants.REQUIREMENTDETAILS, admin.getRequirementDetails());
	    srcMap.addValue(AdminTableConstants.STARTDATE, admin.getStartDate());
	    srcMap.addValue(AdminTableConstants.ENDDATE, admin.getEndDate());
	    srcMap.addValue(AdminTableConstants.NOOFCANDIDATES, admin.getNoOfCandidates());
	    srcMap.addValue(AdminTableConstants.SKILLID, admin.getSkillId());
	    namedParameterJdbcTemplate.update(sql,srcMap,holder, new String[] {AdminTableConstants.REQUIREMENTID});
	    admin.setRequirementId(holder.getKey().intValue());
	    return admin;
	}
	
//	private void saveAdminSkill(AdminSkillSet adminskill,jobOpenings admin)
//	{
//		final KeyHolder holder = new GeneratedKeyHolder();
//	    String sql=AdmintableQuery.ADMINSKLLSETSAVEQUERY;	  
//	    MapSqlParameterSource srcMap = new MapSqlParameterSource();
//	    srcMap.addValue(AdminTableConstants.SKILLS, adminskill.getSkills());
//	    srcMap.addValue(AdminTableConstants.REQUIREMENTDETAILS, admin.getRequirementId());
//	    namedParameterJdbcTemplate.update(sql,srcMap,holder, new String[] {AdminTableConstants.SKILLSETID});
//	    adminskill.setRequirementId(holder.getKey().intValue());
//	}

	@Override
	public List<jobOpenings> getall() {
		String query=AdmintableQuery.FETCHQUERY;
		
		return jdbctemplate.query(query, (resultSet, rowNum)->{
			jobOpenings admin=new jobOpenings();
			admin.setRequirementDetails(resultSet.getString(AdminTableConstants.REQUIREMENTDETAILS));
			admin.setRequirementId(resultSet.getLong(AdminTableConstants.REQUIREMENTID));
			admin.setStartDate(resultSet.getDate(AdminTableConstants.STARTDATE));
			admin.setEndDate(resultSet.getDate(AdminTableConstants.ENDDATE));
			admin.setNoOfCandidates(resultSet.getInt(AdminTableConstants.NOOFCANDIDATES));
			admin.setSkillId(resultSet.getLong(AdminTableConstants.SKILLID));
			admin.setSkill(resultSet.getString(AdminTableConstants.SKILL));
			
			return admin;
		});
	}
	
//	private List<AdminSkillSet>getadminSkill(long requirementId)
//	{
//		String query=AdmintableQuery.FETCHSKILLQUERY+requirementId;
//		return jdbctemplate.query(query, (resultSet, rowNum)->{
//			AdminSkillSet adminskills=new AdminSkillSet();
//			adminskills.setRequirementId(resultSet.getLong(AdminTableConstants.REQUIREMENTID));
//			adminskills.setSkills(resultSet.getString(AdminTableConstants.SKILLS));
//			adminskills.setSkillsetId(resultSet.getLong(AdminTableConstants.SKILLSETID));
//			return adminskills;
//		});
//		
//	}

	@Override
	public List<SkillSets> getallSkills() {
		String skillsetquery="select * from skillsSet";
		return jdbctemplate.query(skillsetquery, (resultSet, rowNum)->{
			SkillSets skillset=new SkillSets();
			skillset.setSkillid(resultSet.getLong(AdminTableConstants.SKILLID));
			skillset.setSkill(resultSet.getString(AdminTableConstants.SKILL));
			return skillset;
		}) ;
	}

}

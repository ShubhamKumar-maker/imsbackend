package com.accolite.ims.ims.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.accolite.ims.ims.dao.SheduleInterviewDao;
import com.accolite.ims.ims.modles.SheduleInterview;
import com.accolite.ims.ims.tableconstant.SheduleInterviewTableConstants;

@Component
public class SheduleInterviewDaoImpl implements SheduleInterviewDao {
	
	@Autowired
	  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public SheduleInterview savaData(SheduleInterview sheduleinterview) {
		final KeyHolder holder = new GeneratedKeyHolder();
	    String sql="insert into sheduleInterview(panelID,interviewDate,interviewTime,candidateID,skillID) values(:panelID,:interviewDate,:interviewTime,:candidateID,:skillID)";	  
	    MapSqlParameterSource srcMap = new MapSqlParameterSource();
	    srcMap.addValue(SheduleInterviewTableConstants.PANELID,sheduleinterview.getPanelID());
	    srcMap.addValue(SheduleInterviewTableConstants.INTERVIEWTIME,sheduleinterview.getInterviewTime());
	    srcMap.addValue(SheduleInterviewTableConstants.INTERVIEWDATE,sheduleinterview.getInterviewDate());
	    srcMap.addValue(SheduleInterviewTableConstants.CANDIDATEID, sheduleinterview.getCandidateID());
	    srcMap.addValue(SheduleInterviewTableConstants.SKILLID, sheduleinterview.getSkillID());
	    namedParameterJdbcTemplate.update(sql,srcMap,holder, new String[] {SheduleInterviewTableConstants.SHEDULEINTERVIEWID});
		return sheduleinterview;
	}

	@Override
	public List<SheduleInterview> getallData() {
		String sqlquery="select * from sheduleInterview"; 
		return jdbctemplate.query(sqlquery, (resultSet,rowNum)->{
			SheduleInterview sheduleinterview=new SheduleInterview();
			sheduleinterview.setCandidateID(resultSet.getLong(SheduleInterviewTableConstants.CANDIDATEID));
			sheduleinterview.setInterviewDate(resultSet.getDate(SheduleInterviewTableConstants.INTERVIEWDATE));
			sheduleinterview.setPanelID(resultSet.getString(SheduleInterviewTableConstants.PANELID));
			sheduleinterview.setInterviewTime(resultSet.getString(SheduleInterviewTableConstants.INTERVIEWTIME));
			sheduleinterview.setSkillID(resultSet.getLong(SheduleInterviewTableConstants.SKILLID));
			return sheduleinterview;
		});
	}
	
	
	

}

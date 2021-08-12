package com.accolite.ims.ims.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.accolite.ims.ims.dao.CandidateDao;
import com.accolite.ims.ims.modles.Candidate;
import com.accolite.ims.ims.tableconstant.CandidateTableConstant;


@Component
public class CandidateDaoImpl  implements CandidateDao{
	
	@Autowired
	  private JdbcTemplate jdbctemplate;

	@Override
	public List<Candidate> getcandidatebySkill(String skill) {
		String skillquery="select * from candidate join skillsSet on candidate.skillid=skillsSet.skillId where skillsSet.skills=\""+skill+"\"";
		return jdbctemplate.query(skillquery, (resultSet, rowNum)->{
			Candidate candidate=new Candidate();
			candidate.setCandidateId(resultSet.getLong(CandidateTableConstant.CANDIDATEID));
			candidate.setName(resultSet.getString(CandidateTableConstant.CANDIDATNAME));
			candidate.setSkill(resultSet.getLong(CandidateTableConstant.CANDIDATESKILL));
			candidate.setCurrentlevel(resultSet.getInt(CandidateTableConstant.CANDIDATELEVEL));
			return candidate;
		});
	}

	@Override
	public List<Candidate> getallcandidates() {
		String skillquery="select * from candidate";
		return jdbctemplate.query(skillquery, (resultSet, rowNum)->{
			Candidate candidate=new Candidate();
			candidate.setCandidateId(resultSet.getLong(CandidateTableConstant.CANDIDATEID));
			candidate.setName(resultSet.getString(CandidateTableConstant.CANDIDATNAME));
			candidate.setSkill(resultSet.getLong(CandidateTableConstant.CANDIDATESKILL));
			candidate.setCurrentlevel(resultSet.getInt(CandidateTableConstant.CANDIDATELEVEL));
			return candidate;
		});
	}

}

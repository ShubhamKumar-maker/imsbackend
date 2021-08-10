package com.accolite.ims.ims.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.accolite.ims.ims.dao.Paneldetails;
import com.accolite.ims.ims.modles.PanelAvailabilityDetails;
import com.accolite.ims.ims.modles.PanelEvents;
import com.accolite.ims.ims.query.AdmintableQuery;
import com.accolite.ims.ims.tableconstant.AdminTableConstants;
import com.accolite.ims.ims.tableconstant.PanelTableConstants;
import com.accolite.ims.ims.tableconstant.SheduleInterviewTableConstants;


@Component
public class PaneldetailsDaoImpl implements Paneldetails {
	
	@Autowired
	  private JdbcTemplate jdbctemplate;
	
	@Autowired
	  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<PanelAvailabilityDetails> getdata(String skill,int maxlevel) {
		String sqlquery="select * from panelavilability join panelDetails on panelavilability.panelid=panelDetails.panelid where panelDetails.skill=\""+skill+"\" and panelDetails.maxlevel>="+maxlevel+"";
			
		return jdbctemplate.query(sqlquery, (resultSet, rowNum)->{
			PanelAvailabilityDetails pad=new PanelAvailabilityDetails();
			pad.setPanelId(resultSet.getString(PanelTableConstants.PANELID));
			pad.setPanelavailabletime(resultSet.getString(PanelTableConstants.PANELAVAILABLETIME));
			pad.setPanelavailabledate(resultSet.getDate(PanelTableConstants.PANELAVAILABLEDATE));
			pad.setMaxlevel(resultSet.getInt(PanelTableConstants.PANELMAXLEVEL));
			pad.setPanelskills(resultSet.getString(PanelTableConstants.PANELSKILL));
			pad.setPanelavailableID(resultSet.getLong(PanelTableConstants.PANELAVAILABLEID));
			return pad;
		});
	}

	@Override
	public PanelAvailabilityDetails setPanel(PanelAvailabilityDetails details) {
		final KeyHolder holder = new GeneratedKeyHolder();
	    String sql="insert into panelavilability(panelid,availableDate,availableTime) values(:panelid,:availableDate,:availableTime)";	  
	    MapSqlParameterSource srcMap = new MapSqlParameterSource();
	    srcMap.addValue(PanelTableConstants.PANELID,details.getPanelId());
	    srcMap.addValue(PanelTableConstants.PANELAVAILABLEDATE,details.getPanelavailabledate());
	    srcMap.addValue(PanelTableConstants.PANELAVAILABLETIME,details.getPanelavailabletime());
	    namedParameterJdbcTemplate.update(sql,srcMap,holder, new String[] {PanelTableConstants.PANELAVAILABLEID});
	    details.setPanelavailableID(holder.getKey().intValue());
	    return details;
	}

	@Override
	public List<PanelEvents> getPanelAllEvents(String panelId) {
		String sqlqry="select interviewDate, interviewTime from sheduleInterview where panelID=\""+panelId+"\" and interviewDate>=CURDATE(); \r\n"
				+ "";
		return jdbctemplate.query(sqlqry,(resultSet,rowNum)->{
			PanelEvents pe=new PanelEvents();
			pe.setStart(resultSet.getDate(SheduleInterviewTableConstants.INTERVIEWDATE));
			pe.setTitle(resultSet.getString(SheduleInterviewTableConstants.INTERVIEWTIME));
			return pe;
		});
	}

}

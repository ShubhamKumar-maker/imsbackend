package com.accolite.ims.ims.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.accolite.ims.ims.dao.Paneldetails;
import com.accolite.ims.ims.modles.PanelAvailabilityDetails;
import com.accolite.ims.ims.tableconstant.PanelTableConstants;


@Component
public class PaneldetailsDaoImpl implements Paneldetails {
	
	@Autowired
	  private JdbcTemplate jdbctemplate;

	@Override
	public List<PanelAvailabilityDetails> getdata(String skill,int maxlevel) {
		String sqlquery="select * from panelavilability join panelDetails on panelavilability.panelid=panelDetails.panelid where panelDetails.skill=\""+skill+"\" and panelDetails.maxlevel>="+maxlevel+"";
			
		return jdbctemplate.query(sqlquery, (resultSet, rowNum)->{
			PanelAvailabilityDetails pad=new PanelAvailabilityDetails();
			pad.setPanelId(resultSet.getString(PanelTableConstants.PANELID));
			pad.setPanelavailabletime(resultSet.getTime(PanelTableConstants.PANELAVAILABLETIME));
			pad.setPanelavailabledate(resultSet.getDate(PanelTableConstants.PANELAVAILABLEDATE));
			pad.setMaxlevel(resultSet.getInt(PanelTableConstants.PANELMAXLEVEL));
			pad.setPanelskills(resultSet.getString(PanelTableConstants.PANELSKILL));
			pad.setPanelavailableID(resultSet.getLong(PanelTableConstants.PANELAVAILABLEID));
			return pad;
		});
	}

}

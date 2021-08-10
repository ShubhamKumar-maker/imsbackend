package com.accolite.ims.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.ims.ims.dao.CandidateDao;
import com.accolite.ims.ims.dao.JobOpeningDao;
import com.accolite.ims.ims.dao.Paneldetails;
import com.accolite.ims.ims.dao.SheduleInterviewDao;
import com.accolite.ims.ims.modles.Candidate;
import com.accolite.ims.ims.modles.PanelAvailabilityDetails;
import com.accolite.ims.ims.modles.PanelEvents;
import com.accolite.ims.ims.modles.SheduleInterview;
import com.accolite.ims.ims.modles.SkillSets;
import com.accolite.ims.ims.modles.jobOpenings;
import com.accolite.ims.ims.service.ImsService;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/ims")
public class IMSController {
	
	@Autowired
	private ImsService imsservice;
	
	@Autowired
	private Paneldetails paneldetails;
	
	@Autowired
	private JobOpeningDao jobopenings;
	
	@Autowired
	private CandidateDao candidatedao;
	
	@Autowired
	private SheduleInterviewDao sheduleInterviewdao;
	
	@GetMapping("/test")
	public String testfun()
	{
		return "hello";
	}
	
	@PostMapping("/saveAdminDetails")
	public jobOpenings adminDetails(@RequestBody jobOpenings admin)
	{
		System.out.println(admin);
		return imsservice.save(admin);
	}
	
	@GetMapping("/getAdminrecords")
	public List<jobOpenings>getAdminrecords()
	{
		return imsservice.fetchAdmin();
	}
	
	@GetMapping("/pannelavailable/{skill}/{maxlevel}")
	public List<PanelAvailabilityDetails>getdetails(@PathVariable String skill,@PathVariable int maxlevel)
	{
		return paneldetails.getdata(skill,maxlevel);
	}
	
	@GetMapping("/getskills")
	public List<SkillSets>getallskill()
	{
		return jobopenings.getallSkills();
	}
	
	@GetMapping("/getallCandidate/{skill}")
	public List<Candidate>getallcandidateskill(@PathVariable String skill)
	{
		return candidatedao.getcandidatebySkill(skill);
	}

	@PostMapping("/setsheduleInterviewdetail")
	public SheduleInterview setInterviewDetail(@RequestBody SheduleInterview sheduleinterview)
	{
		return sheduleInterviewdao.savaData(sheduleinterview);
	}
	
	@GetMapping("/getallsheduledInterview")
	public List<SheduleInterview>getallsheduleinterview()
	{
		return sheduleInterviewdao.getallData();
	}
	
	@GetMapping("/findEmployeeByID/{username}")
	public boolean findEmployee(@PathVariable String username)
	{
		return imsservice.findbyId(username);
	}
	
	@PostMapping("/setPanelAvailability")
	public PanelAvailabilityDetails setPanelavailabilty(@RequestBody PanelAvailabilityDetails panelAvailability)
	{
		return paneldetails.setPanel(panelAvailability);
	}
	
	@GetMapping("/getpanelallEvents/{panelId}")
	public List<PanelEvents>getallEvents(@PathVariable String panelId)
	{
		return imsservice.getallevent(panelId);
	}
}

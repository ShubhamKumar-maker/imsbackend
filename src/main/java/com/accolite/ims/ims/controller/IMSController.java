package com.accolite.ims.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.ims.ims.modles.Admin;
import com.accolite.ims.ims.service.ImsService;

@RestController
@RequestMapping("/ims")
public class IMSController {
	
	@Autowired
	private ImsService imsservice;
	
	@GetMapping("/test")
	public String testfun()
	{
		return "hello";
	}
	
	@PutMapping("/saveAdminDetails")
	public Admin adminDetails(@RequestBody Admin admin)
	{
		return imsservice.save(admin);
	}
	
	@GetMapping("/getAdminrecords")
	public List<Admin>getAdminrecords()
	{
		return imsservice.fetchAdmin();
	}

}

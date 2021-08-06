package com.accolite.ims.ims.dao;

import java.util.List;

import com.accolite.ims.ims.modles.Admin;

public interface AdminDao {
	Admin saveAdmin(Admin admin);
	List<Admin> getall();
}

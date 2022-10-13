package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.bean.Admin;
import com.exmaple.repo.AdminRepo;


public class AdminSer {
	@Autowired
	AdminRepo adr;


	public String adminLogin(Admin u)
	{
		Admin ad= adr.findById(1).get();
		if(u.getUsername().equals(ad.getUsername())&&u.getPassword().equals(ad.getPassword()))
		{
			return "Welcome admin";
		}
		else
		{
			return "invalid Credentials";
		}
	}
	public String adminupdate(Admin a)
	{
		Admin ad= adr.findById(1).get();
		ad.setUsername(a.getUsername());
		ad.setPassword(a.getUsername());
		adr.saveAndFlush(ad);
			return "Updated";
	

	}
}

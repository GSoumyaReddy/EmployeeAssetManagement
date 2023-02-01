package com.cg.iservice;

import com.cg.entity.Admin;
import com.cg.entity.Employee;

public interface IAdminService {
	
	public Employee updateEmpName(int empId,Employee employee);
	
}

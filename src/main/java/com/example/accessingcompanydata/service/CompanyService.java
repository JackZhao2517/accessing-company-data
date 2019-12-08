package com.example.accessingcompanydata.service;

import java.util.List;
import com.example.accessingcompanydata.entity.Company;

public interface CompanyService {
	List<Company> getAllByCompanyName(String cpName);
	
	Company getByCompanyid(Integer id);

	List<Company> getAllCompany();

}

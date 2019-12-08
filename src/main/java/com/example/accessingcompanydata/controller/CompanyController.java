package com.example.accessingcompanydata.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;

import com.example.accessingcompanydata.AccessingCompanyDataApplication;
import com.example.accessingcompanydata.entity.*;
import com.example.accessingcompanydata.service.*;
import com.example.accessingcompanydata.utils.*;
import com.example.accessingcompanydata.model.*;

@RestController
public class CompanyController {
	private static final Logger log = LoggerFactory.getLogger(CompanyController.class);

	@Autowired
	private CompanyServiceImpl companyService;
	public CompanyController(){
		
	}

	@GetMapping("/all")
	@ResponseBody
	public List<Company> getAllCompany() throws Exception {
		log.info("ResponseEntity found with getAllCompany():");
		log.info("-------------------------------");
		try {			
			List<Company> companyList = companyService.getAllCompany();
//			List<CompanyDtls> companyDtlsList = new ArrayList<>();
//			for (Company company : companyList) {
//				CompanyDtls companyDtls = new CompanyDtls();
//				BeanUtilsCopy.copyPropertiesNoNull(company, companyDtls);
//				companyDtlsList.add(companyDtls);
//			}
			log.info("ResponseEntity end with getAllCompany():");
			log.info("-------------------------------");
			//return ResponseEntity.ok().body(new ResponseBean(OK.value(), OK.getReasonPhrase()).data(companyDtlsList));
			return companyList;
		} catch (Exception e) {
			System.out.println("catch error here:");
			System.out.println(e);
			return null;
		}
	}

	@GetMapping("/name/{companyId}")
	@ResponseBody
	public Company getByCompanyId(@PathVariable("companyId") Integer companyId) throws Exception {
		log.info("ResponseEntity found with getByCompanyId():");
		log.info("-------------------------------");
		Company company = companyService.getByCompanyid(companyId);
		log.info("-------------------------------");
		log.info("companyService.getByCompanyid = {}",company.toString());
		return company;
	}
}

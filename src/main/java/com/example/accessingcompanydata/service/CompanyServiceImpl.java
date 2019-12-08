package com.example.accessingcompanydata.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingcompanydata.entity.Company;
import com.example.accessingcompanydata.dao.CompanyRepository;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
	// Implementing Constructor based DI
	private CompanyRepository repository;

	public CompanyServiceImpl() {

	}

	@Autowired
	public CompanyServiceImpl(CompanyRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Company> getAllByCompanyName(String cpName) {
		return repository.findByCompanyName(cpName);
	}

	@Override
	public Company getByCompanyid(Integer id) {
		return repository.findByCompanyid(id);
	}
	  @Override
	  public List<Company> getAllCompany() {
	    return repository.findAll();
	  }

}

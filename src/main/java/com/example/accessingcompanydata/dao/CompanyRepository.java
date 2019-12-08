package com.example.accessingcompanydata.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.accessingcompanydata.entity.Company;
import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	List<Company> findByCompanyName(String cpName);
	
	Company findByCompanyid(Integer id);
}

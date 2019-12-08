package com.example.accessingcompanydata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.accessingcompanydata.entity.Company;
import com.example.accessingcompanydata.dao.CompanyRepository;

@SpringBootApplication
public class AccessingCompanyDataApplication {
	private static final Logger log = LoggerFactory.getLogger(AccessingCompanyDataApplication.class);

	public static void main(String[] args) {
		System.out.println( "AccessingCompanyDataApplication start!!! now" );
		SpringApplication.run(AccessingCompanyDataApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(CompanyRepository repository) {
//		return (args) -> {
//			// save a few companies
//			repository.save(new Company("800001", "Vivo_Plus"));
////			repository.save(new Company("800002", "XiMi"));
////			repository.save(new Company("800003", "HuaWei"));
////			repository.save(new Company("800004", "Oracle"));
////			repository.save(new Company("800005", "Ciso"));
//
//			// fetch all Company
//			log.info("Company found with findAll():");
//			log.info("-------------------------------");
//			for (Company cp : repository.findAll()) {
//				log.info(cp.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Company cp = repository.findByCompanyId(7);
//			log.info("Company found with findById(7):");
//			log.info("--------------------------------");
//			log.info(cp.toString());
//			log.info("");
//
//			// fetch Company by last name
//			log.info("Company found with findByCompanyName('HuaWei'):");
//			log.info("--------------------------------------------");
//			repository.findByCompanyName("HuaWei").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			// log.info(bauer.toString());
//			// }
//			log.info("");
//		};
//	}
}

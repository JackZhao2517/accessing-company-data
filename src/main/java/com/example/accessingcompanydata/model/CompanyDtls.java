package com.example.accessingcompanydata.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;

public class CompanyDtls implements Serializable {
  
	/**
	 * 
	 */
	private static final long serialVersionUID = -7615373303183116290L;
	

	private Integer companyid;

	private String companyCode;

	private String companyName;

	private BigDecimal turnover;
	private String ceo;
	private String boardOfDirectors;
	private String listedinskex;
	private String sectorname;
	private String brifeWriteup;
	private String stockCode;
	private String companyStatus;


}

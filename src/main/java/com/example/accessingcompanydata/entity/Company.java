package com.example.accessingcompanydata.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "company")
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "companyid")
	private Integer companyid;
	
	@Column(name = "companycode")
	private String companyCode;
	@Column(name = "companyname")
	private String companyName;
	@Column(name = "turnover")
	private BigDecimal turnover;
	@Column(name = "ceo")
	private String ceo;
	
	@Column(name = "boardofdirectors")
	private String boardOfDirectors;
	@Column(name = "listedInskex")
	private String listedinskex;
	@Column(name = "sectorName")
	private String sectorname;
	@Column(name = "brifewriteup")
	private String brifeWriteup;
	@Column(name = "stockcode")
	private String stockCode;

	@Column(name = "companystatus")
	private String companyStatus;
	
	public Integer getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BigDecimal getTurnover() {
		return turnover;
	}

	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getListedinskex() {
		return listedinskex;
	}

	public void setListedinskex(String listedinskex) {
		this.listedinskex = listedinskex;
	}

	public String getSectorname() {
		return sectorname;
	}

	public void setSectorname(String sectorname) {
		this.sectorname = sectorname;
	}

	public String getBrifeWriteup() {
		return brifeWriteup;
	}

	public void setBrifeWriteup(String brifeWriteup) {
		this.brifeWriteup = brifeWriteup;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}


	public Company() {
		super();
	}
	
//	public Company(String nameCode, String nameCP) {
//	    this.companyCode = nameCode;
//	    this.companyName = nameCP;
//	  }
	
//	@Override
//	  public String toString() {
//	    return String.format(
//	        "Company[id=%d, companycode='%s', companyname='%s']",
//	        companyId, companyCode, companyName);
//	  }
	

}

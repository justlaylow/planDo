package com.study.planDo.Dto;

/**
 * 保险设计书作成状况取得Dto
 * */
public class DaoInDto {
	//支社code
	private String zsCode;
	//1级机关code
	private String jgCode;
	//个人code
	private String personCode;
	//世带id
	private int sdId;
	//设计书No
	private int sjsNo;
	//顾客No
	private int cusNo;
	
	
	public String getZsCode() {
		return zsCode;
	}
	public void setZsCode(String zsCode) {
		this.zsCode = zsCode;
	}
	public String getJgCode() {
		return jgCode;
	}
	public void setJgCode(String jgCode) {
		this.jgCode = jgCode;
	}
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	public int getSdId() {
		return sdId;
	}
	public void setSdId(int sdId) {
		this.sdId = sdId;
	}
	public int getSjsNo() {
		return sjsNo;
	}
	public void setSjsNo(int sjsNo) {
		this.sjsNo = sjsNo;
	}
	public int getCusNo() {
		return cusNo;
	}
	public void setCusNo(int cusNo) {
		this.cusNo = cusNo;
	}
}

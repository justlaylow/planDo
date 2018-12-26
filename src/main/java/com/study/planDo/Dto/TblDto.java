package com.study.planDo.Dto;

import java.util.Date;

public class TblDto {
	//支社code
		private String zsCode;
		//机关code
		private String jgCode;
		//个人code
		private String pensonCode;
		//世带id
		private String sdId;
		//集计年月度
		private Date jjDate;
		//作成日
		private Date finishDay;
		//保险设计书作成日
		private Date bxFinishDay;
		//被保险者名
		private String cusName;
		//被保险者名
		private String cusName2;
		//生年月日
		private Date both;
		//性别区分
		private int sex;
		//保险商品名
		private String product;
		//转换flag
		private String change;
		//活动评价s
		private String evaluate;
		//修s
		private String evaluateS;
		//设计书番号
		private int sjsNo;
		//顾客番号
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
		public String getPensonCode() {
			return pensonCode;
		}
		public void setPensonCode(String pensonCode) {
			this.pensonCode = pensonCode;
		}
		public String getSdId() {
			return sdId;
		}
		public void setSdId(String sdId) {
			this.sdId = sdId;
		}
		public Date getJjDate() {
			return jjDate;
		}
		public void setJjDate(Date jjDate) {
			this.jjDate = jjDate;
		}
		public Date getFinishDay() {
			return finishDay;
		}
		public void setFinishDay(Date finishDay) {
			this.finishDay = finishDay;
		}
		public Date getBxFinishDay() {
			return bxFinishDay;
		}
		public void setBxFinishDay(Date bxFinishDay) {
			this.bxFinishDay = bxFinishDay;
		}
		public String getCusName() {
			return cusName;
		}
		public void setCusName(String cusName) {
			this.cusName = cusName;
		}
		public String getCusName2() {
			return cusName2;
		}
		public void setCusName2(String cusName2) {
			this.cusName2 = cusName2;
		}
		public Date getBoth() {
			return both;
		}
		public void setBoth(Date both) {
			this.both = both;
		}
		public int getSex() {
			return sex;
		}
		public void setSex(int sex) {
			this.sex = sex;
		}
		public String getProduct() {
			return product;
		}
		public void setProduct(String product) {
			this.product = product;
		}
		public String getChange() {
			return change;
		}
		public void setChange(String change) {
			this.change = change;
		}
		public String getEvaluate() {
			return evaluate;
		}
		public void setEvaluate(String evaluate) {
			this.evaluate = evaluate;
		}
		public String getEvaluateS() {
			return evaluateS;
		}
		public void setEvaluateS(String evaluateS) {
			this.evaluateS = evaluateS;
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

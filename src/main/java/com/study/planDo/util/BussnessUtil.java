package com.study.planDo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.study.planDo.Dto.UtilInDto;
import com.study.planDo.Dto.UtilOutDto;

public class BussnessUtil {
	//业务日付取得
	public Date bussnessDate() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2018-12-26");
		return date;
	}
	
	//业务情报取得
	public UtilOutDto monthMsg(UtilInDto utilInDto){
		//处理...
		return new UtilOutDto();
	}
}

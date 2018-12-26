package com.study.planDo.service.impl;


import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.planDo.Dao.DbDao;
import com.study.planDo.Dto.DaoInDto;
import com.study.planDo.Dto.SekkeishoKihonDto;
import com.study.planDo.Dto.TblDto;
import com.study.planDo.Dto.UtilInDto;
import com.study.planDo.Dto.WAYSessionAppDto;
import com.study.planDo.pojo.SekkeishoKihon;
import com.study.planDo.util.BussnessUtil;
@Service
public class PlanDoService {
	//变数.业务日付
	private Date ktdDate;
	//变数.集计年月度
	private Date jjDate;
	@Autowired
	private DaoInDto daoInDto;
	private BussnessUtil bussnessUtil;
	private DbDao dbDao;
	
	public void KtdBskMksSks(SekkeishoKihonDto sekkeishoKihonDto
			,String hihokenshaNmKana
			,WAYSessionAppDto waySessionAppDto
			) throws ParseException{
		//业务日付
		ktdDate = bussnessUtil.bussnessDate();
		
		//保险设计书作成状况取得处理
		DaoInDto daoInDto = new DaoInDto();
		daoInDto.setZsCode("user.zsCode");
		daoInDto.setJgCode("user.jgCode");
		daoInDto.setPersonCode("user.pensonCode");
		daoInDto.setSdId(waySessionAppDto.sdId);
		daoInDto.setSjsNo(sekkeishoKihonDto.getSekkeisho_kihon_dto().sjsNo);
		
		//调用dbDao中的方法取得daoOutDto,这里直接取得
		SekkeishoKihon daoOutDto = dbDao.finishSta(daoInDto);
		
		//申请书做成状况编集
		TblDto tblDto = new TblDto();
		if(null!=daoInDto){
			tblDto.setZsCode(daoInDto.getZsCode());
			//...
			tblDto.setFinishDay(ktdDate);//变数.业务日付
			//...
			tblDto.setCusNo(daoInDto.getCusNo());
		}else{//这里报dead code的原因是因为给daoInDto数据了，实际在数据库中不一定不为空
			UtilInDto utilInDto = new UtilInDto();
			utilInDto.setObjectDate(ktdDate);
			//设定变数.集计年月度
			jjDate = bussnessUtil.monthMsg(utilInDto).basicDate;
			
			//取得保险商品名
			if(0!=sekkeishoKihonDto.getSekkeisho_kihon_dto().product){
				//取得codeMasterDto
				if(true){//null!=codeMasterDto
					//不处理
				}else{
					//throw exception
				}
			}else{
				//不处理
			}
			
			//转换flag设定
			//申请书作成连番最大值取得
			//申请书状况的作成连番
			//申请书作成状况的追加处理
		}
	}
	
}

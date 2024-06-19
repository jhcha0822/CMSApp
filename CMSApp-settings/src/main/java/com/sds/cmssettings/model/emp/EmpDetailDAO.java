package com.sds.cmssettings.model.emp;

import org.apache.ibatis.annotations.Mapper;

import com.sds.cmssettings.domain.Emp;
import com.sds.cmssettings.domain.EmpDetail;

@Mapper
public interface EmpDetailDAO {

	public void insert(EmpDetail empDetail);
	public EmpDetail selectByEmpIdx(int empIdx);
	public void update(EmpDetail empDetail);
	
	public Emp selectByLoginData(EmpDetail empDetail);
	public EmpDetail selectByUid(String empId);
	public int selectEmpIdxByUid(String empId);
}

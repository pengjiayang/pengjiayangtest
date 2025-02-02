package com.wl.cgb.ht.ansel.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wl.cgb.ht.ansel.bean.CargoReceipt;
import com.wl.cgb.ht.ansel.bean.EmployeeWage;
import com.wl.cgb.ht.ansel.bean.ExtraClear;
import com.wl.cgb.ht.ansel.bean.ExtraIncome;
import com.wl.cgb.ht.ansel.bean.FinanceFee;
import com.wl.cgb.ht.ansel.bean.IncomeMonthlyTemp;
import com.wl.cgb.ht.ansel.bean.ManageFee;

public interface ICheckService {

	public boolean save(ExtraIncome extraIncome);
	
	public Page<ExtraIncome> selectAllExtra(Pageable pageable);
	
	public List<ExtraIncome> selectByIncomeMonth(String incomeMonth);
	
	
	public List<CargoReceipt> selectBySignTime(String beginTime,String endTime);
	
	
    public boolean save(FinanceFee financeFee);
	
	public Page<FinanceFee> selectAllFinance(Pageable pageable);
	
	public List<FinanceFee> selectByFPayoutMonth(String payoutMonth);
	
	
    public boolean save(ManageFee manageFee);
	
	public Page<ManageFee> selectAllManage(Pageable pageable);
	
	public List<ManageFee> selectByMPayoutMonth(String payoutMonth);
	
	public ManageFee selectByMId(int id);
	
	
    public boolean save(EmployeeWage employeeWage);
	
	public Page<EmployeeWage> selectAllWage(Pageable pageable);
	
	public List<EmployeeWage> selectByDate(String beginTime,String endTime);
	
	public EmployeeWage selectByEmployeeCode(String employeeCode);
	
	
	public List<ExtraClear> selectByBalanceDate(String beginTime,String endTime);
	
	
	public IncomeMonthlyTemp save();
		
	public IncomeMonthlyTemp selectAll();
	
	public IncomeMonthlyTemp selectByMonth(String month);
	
}

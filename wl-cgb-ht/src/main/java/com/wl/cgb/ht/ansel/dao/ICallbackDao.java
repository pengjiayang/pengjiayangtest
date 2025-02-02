package com.wl.cgb.ht.ansel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.CallbackInfo;

public interface ICallbackDao extends JpaRepository<CallbackInfo, Long> {
	
	public CallbackInfo findByGoodsBillIdAndType(String goodsBillId, String type);
	
}

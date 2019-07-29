package com.accp.xxmis.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.xxmis.dao.itemdao;
import com.accp.xxmis.pojo.itemtypes;
import com.accp.xxmis.pojo.peitems;
import com.accp.xxmis.pojo.t_student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class itembiz {

	@Autowired
	private itemdao dao;
	
	public List<itemtypes> findtypebyid(Integer typeid) {
		return dao.findtypebyid(typeid);
	}
	
	public peitems findbyid(Integer itemid){
		return dao.findbyid(itemid);
	}
	
	public int update(peitems peitems) {
		return dao.update(peitems);
	}
	
	public List<peitems> findtypebytypeid(Integer typeid) {
		return dao.findtypebytypeid(typeid);
	}
	
	public List<itemtypes> findall() {
		return dao.findall();
	}
	
}

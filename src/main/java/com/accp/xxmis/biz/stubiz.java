package com.accp.xxmis.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.xxmis.dao.studao;
import com.accp.xxmis.pojo.t_student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class stubiz {
	@Autowired
	private studao dao;
	
	public PageInfo<t_student> find(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<t_student>(dao.find());
	}
	public List<t_student> loginIn(String code,String name){
		return dao.loginIn(code, name);
	}
	public List<t_student> find(){
		return dao.find();
	}
	public List<t_student> findbyname(String name){
		return dao.findbyname(name);
	}
	public int deletebyname(String name) {
		return dao.deletebyname(name);
	}
}

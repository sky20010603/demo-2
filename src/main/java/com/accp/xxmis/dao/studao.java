package com.accp.xxmis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.xxmis.pojo.t_student;

public interface studao {
    /**
     * 查询信息
     * @return
     */
	public List<t_student> find();
	/**
	 * 登录
	 */
	public List<t_student> loginIn(@Param("code")String code,@Param("name")String name);
	/**
	 * 查询详细信息
	 */
	public List<t_student> findbyname(@Param("name")String name);
	/**
	 * 删除
	 */
	public int deletebyname(@Param("name")String name);
	
}

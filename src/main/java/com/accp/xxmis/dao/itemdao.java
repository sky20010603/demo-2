package com.accp.xxmis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.xxmis.pojo.itemtypes;
import com.accp.xxmis.pojo.peitems;

public interface itemdao {

	public List<itemtypes> findtypebyid(@Param("typeid")Integer typeid);
	
	public int update(@Param("peitems")peitems peitems);
	
	public peitems findbyid(@Param("itemid")Integer itemid);
	
	public List<peitems> findtypebytypeid(@Param("typeid")Integer typeid);
	
	public List<itemtypes> findall();
}

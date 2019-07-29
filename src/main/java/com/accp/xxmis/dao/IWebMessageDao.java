package com.accp.xxmis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.xxmis.pojo.WebMessage;


public interface IWebMessageDao {

	public void saveMessage(@Param("message") WebMessage message);

	public List<WebMessage> queryAllMessage();
}

package com.accp.xxmis.biz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.xxmis.dao.IWebMessageDao;
import com.accp.xxmis.pojo.WebMessage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WebMessageBiz {

	@Autowired
	private IWebMessageDao messageDao;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addMessage(WebMessage message) {
		messageDao.saveMessage(message);
	}

	public PageInfo<WebMessage> findMessageListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<WebMessage>(messageDao.queryAllMessage());
	}

}

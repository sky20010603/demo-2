package com.accp.xxmis.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.xxmis.biz.WebMessageBiz;
import com.accp.xxmis.pojo.WebMessage;
import com.accp.xxmis.util.LoggerUtils;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/c/message")
public class WebMessageAction {

	@Autowired
	private WebMessageBiz messageBiz;

	@GetMapping("getList")
	public String getMessageList(Integer p, Integer s, Model model) {
		PageInfo<WebMessage> pageInfo = messageBiz.findMessageListByPage(p, s);
		//pageInfo.getList().clear();
		model.addAttribute("PAGE_INFO", pageInfo);
		return "msg";
	}

	@GetMapping("del1")
	public String removeMessageInfo1(Integer mid) {
		LoggerUtils.debug(WebMessageAction.class, "移除id:" + mid);
		return "redirect:/c/message/getList?p=1&s=3";
	}

	@GetMapping("del2/{mid}")
	@ResponseBody
	public Map<String, Object> removeMessageInfo2(@PathVariable Integer mid) {
		LoggerUtils.debug(WebMessageAction.class, "移除id:" + mid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return message;
	}

}

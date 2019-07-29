package com.accp.xxmis.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.xxmis.biz.itembiz;
import com.accp.xxmis.biz.stubiz;
import com.accp.xxmis.pojo.itemtypes;
import com.accp.xxmis.pojo.peitems;
import com.accp.xxmis.pojo.t_student;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/c/sky")
public class itemaction {

	@Autowired
	private itembiz biz;
	
	@GetMapping("item")
	public String goitme() {
		return "item";
	}
	@GetMapping("findtypebyid")
	public String findtypebyid(Model model,String typeid) {
		System.err.println(typeid);
		if(typeid=="") {
			System.out.println("空的");
			model.addAttribute("MSG", "请输入要查询的类型");
			return "item";//必须是模板文件名【转发】   
		}
		System.err.println("根据条件查询");	
		List<itemtypes> t=biz.findall();
		List<peitems> p = biz.findtypebytypeid(Integer.parseInt(typeid));
		model.addAttribute("PAGE_INFO", p);
		return "item2";
                           

	}
	@GetMapping("findbyid")
	public String findbyid(Model model,String itemid, HttpSession session) {
		System.err.println(itemid);
		System.err.println("查询单个");
		peitems one = biz.findbyid(Integer.parseInt(itemid));
		//pageInfo.getList().clear();
		System.out.println(one.getItemname());
		model.addAttribute("van", one);
		session.setAttribute("v",one);
		return "upd";
	}
	@GetMapping("update")
	public String update(Model model,peitems peitems, HttpSession session
			,String itemid,String itemname,String typeid,String necessary,String ref,String price,
			String info
			) {
		System.err.println("修改");
		System.out.println(itemname);
		System.out.println(typeid);
		System.out.println(necessary);
		System.out.println(ref);
		System.out.println(price);
		System.out.println(info);
		biz.update(new peitems(Integer.parseInt(itemid),itemname,Integer.parseInt(typeid), Integer.parseInt(necessary), ref, Integer.parseInt(price), info));
		return "item";
	}
}

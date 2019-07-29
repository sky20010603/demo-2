package com.accp.xxmis.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.accp.xxmis.biz.stubiz;
import com.accp.xxmis.pojo.Users;
import com.accp.xxmis.pojo.t_student;
import com.github.pagehelper.PageInfo;

@SessionAttributes(value= {"USER"})
@Controller
@RequestMapping("/c")
public class actiontwo {

	@Autowired
	private stubiz biz;
	
	@GetMapping("login2")
	public String goToLogin() {
		return "login2";
	}
	@GetMapping("findall")
	public String findall() {
		return "findall";
	}
	
	@GetMapping("find")
	public String getMessageList(Integer p, Integer s, Model model) {
		System.err.println("查询用户");
		System.err.println(p);
		System.err.println(s);
		PageInfo<t_student> pageInfo = biz.find(p, s);
		//pageInfo.getList().clear();
		model.addAttribute("PAGE_INFO", pageInfo);
		return "findall2";
	}
	@GetMapping("find2")
	public String find2(String name, Model model) {
		System.err.println("根据名称查询用户");
		System.err.println(name);
        List<t_student> s=biz.findbyname(name);
        model.addAttribute("one",s);
		return "findall3";
	}
	
	@GetMapping("delete")
	public String delete(String name, Model model) {
		System.err.println("删除");
		System.err.println(name);
        biz.deletebyname(name);
		return "redirect:/c/find2?name=name";
	}
	
	@GetMapping("loginIn")
	public String validateUsersInfo(Model model,t_student student, HttpSession session) {
			//System.err.println("用户正确");
			System.err.println(student.getCode());
			System.err.println(student.getName());
			List<t_student> s=biz.loginIn(student.getCode(), student.getName());
			List<t_student> finduser=biz.find();
			for (t_student t : finduser) {
				if(student.getCode().equals(t.getCode())&&student.getName().equals(t.getName())) {
					System.out.println("登录成功");
					session.setAttribute("USERS",new t_student(student.getCode(),student.getName()));
					model.addAttribute("USER", student.getName());
					model.addAttribute("ID", student.getId());
					//return "redirect:/c/find?p=1&s=3";
					return "findall";
				}else {
					model.addAttribute("MSG", "用户名或密码错误");
					return "login2";//必须是模板文件名【转发】                                 
				}
			}
			return null;
	}
}

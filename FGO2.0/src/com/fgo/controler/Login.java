package com.fgo.controler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fgo.model.User;
import com.fgo.service.IUserService;

//登陆逻辑
/**
 * @author saber
 *
 */

@Controller
@RequestMapping("/Login")
public class Login {
	@Autowired
	private IUserService userservice;
	/**验证用户
	 * @param user
	 */
	@RequestMapping("/login.do")
	public String DoLogin(User user) {
		//检验输入合法性
				if(user!=null) {
					//获取session
				HttpSession session=getSession();
					//调用服务
				List<User> userlist=userservice.UserLogin(user);
				//判断用户是否存在
				if(userlist.size()==1) {//用户存在
					
					session.setAttribute("member", userlist.get(0));
					return "forward:/WEB-INF/jsp-face/main.jsp";
					
				}
				
				}
				return "redirect:/Login.html";
	}
	
	/*
	 * 获取session的方法
	 */
	public static HttpSession getSession() { 
	    HttpSession session = null; 
	    try { 
	        session = getRequest().getSession(); 
	    } catch (Exception e) {} 
	        return session; 
	} 
	    
	public static HttpServletRequest getRequest() { 
	    ServletRequestAttributes attrs =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes(); 
	    return attrs.getRequest(); 
	} 

}

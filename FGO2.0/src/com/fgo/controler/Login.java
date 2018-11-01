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

//��½�߼�
/**
 * @author saber
 *
 */

@Controller
@RequestMapping("/Login")
public class Login {
	@Autowired
	private IUserService userservice;
	/**��֤�û�
	 * @param user
	 */
	@RequestMapping("/login.do")
	public String DoLogin(User user) {
		//��������Ϸ���
				if(user!=null) {
					//��ȡsession
				HttpSession session=getSession();
					//���÷���
				List<User> userlist=userservice.UserLogin(user);
				//�ж��û��Ƿ����
				if(userlist.size()==1) {//�û�����
					
					session.setAttribute("member", userlist.get(0));
					return "forward:/WEB-INF/jsp-face/main.jsp";
					
				}
				
				}
				return "redirect:/Login.html";
	}
	
	/*
	 * ��ȡsession�ķ���
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

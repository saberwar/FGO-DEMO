package com.fgo.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fgo.model.Servers;
import com.fgo.model.User;
import com.fgo.service.IPackService;

/**
 * 背包逻辑
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/Package")
public class PackageController {
	@Autowired
	private IPackService packageservice;

	/**
	 * 获取用户拥有从者
	 */
	@RequestMapping("/package.do")
	public String getUserServersList(HttpServletRequest request, Model model) {
		List<Servers> list = null;
		// 获取session
		HttpSession session = request.getSession();
		// 获取登录用户，若无登陆则返回登陆
		User user = (User) session.getAttribute("member");
		if (user == null) {
			return "redirect:/Login.html";
		} else {

			if (user.getId().equals("") && user.getId() == null) {
				return "redirect:/Login.html";
			} else {
				// 查询从者
				list = packageservice.findServersByUserID(user);
				// session.setAttribute("serverlist", list);
				model.addAttribute("serverlist", list);
				// 跳转仓库
				return "forward:/WEB-INF/jsp-face/storage.jsp";
			}

		}

	}

	/**
	 * 接收用户点击从者id，返回从者信息
	 */
	@RequestMapping("/server.do")
	public void FillServerAttr(HttpServletRequest request, HttpServletResponse response) {
		
		// 返回信息
		

String post = null;
		// 获取id
		String serverid = request.getParameter("id");
		System.out.println(serverid);
		if (serverid.equals("") || serverid == null) {
			// id异常，返回出错信息
			try {
				response.getWriter().write("id error");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// 获取session
			HttpSession session = request.getSession();
			// 获取登录用户，若无登陆则返回登陆
			User user = (User) session.getAttribute("member");
			// 查询从者
			List<Servers> list = packageservice.findServersByUserID(user);
			// 检索从者
			for (Servers servers : list) {
				 
				if (serverid.equals(String.valueOf(servers.getId()))) {
					post = servers.getGender() + "-" + servers.getType() + "-" + servers.getStart() + "-"
							+ servers.getLV1_ATK() + "-" + servers.getLV1_HP() + "-" + servers.getLVMAX4_ATK() + "-"
							+ servers.getLVMAX4_HP() + "-" + servers.getMaxATK() + "-" + servers.getMaxHP() + "-"
							+ servers.getRegion() + "-" + servers.getCV() + "-" + servers.getILLUST() + "-"
							+ servers.getTool() + "-" + servers.getCutename();
					break;
				}
			}
		}
           
		try {
			// 回传信息
			response.getWriter().write(post);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
	}

}

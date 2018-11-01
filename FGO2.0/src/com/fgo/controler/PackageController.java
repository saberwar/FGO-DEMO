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
 * �����߼�
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
	 * ��ȡ�û�ӵ�д���
	 */
	@RequestMapping("/package.do")
	public String getUserServersList(HttpServletRequest request, Model model) {
		List<Servers> list = null;
		// ��ȡsession
		HttpSession session = request.getSession();
		// ��ȡ��¼�û������޵�½�򷵻ص�½
		User user = (User) session.getAttribute("member");
		if (user == null) {
			return "redirect:/Login.html";
		} else {

			if (user.getId().equals("") && user.getId() == null) {
				return "redirect:/Login.html";
			} else {
				// ��ѯ����
				list = packageservice.findServersByUserID(user);
				// session.setAttribute("serverlist", list);
				model.addAttribute("serverlist", list);
				// ��ת�ֿ�
				return "forward:/WEB-INF/jsp-face/storage.jsp";
			}

		}

	}

	/**
	 * �����û��������id�����ش�����Ϣ
	 */
	@RequestMapping("/server.do")
	public void FillServerAttr(HttpServletRequest request, HttpServletResponse response) {
		
		// ������Ϣ
		

String post = null;
		// ��ȡid
		String serverid = request.getParameter("id");
		System.out.println(serverid);
		if (serverid.equals("") || serverid == null) {
			// id�쳣�����س�����Ϣ
			try {
				response.getWriter().write("id error");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// ��ȡsession
			HttpSession session = request.getSession();
			// ��ȡ��¼�û������޵�½�򷵻ص�½
			User user = (User) session.getAttribute("member");
			// ��ѯ����
			List<Servers> list = packageservice.findServersByUserID(user);
			// ��������
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
			// �ش���Ϣ
			response.getWriter().write(post);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
	}

}

package com.mohan.lzcc.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mohan.lzcc.model.LoginInfo;
import com.mohan.lzcc.model.User;
import com.mohan.lzcc.service.UserIService;
import com.mohan.lzcc.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "��½������", urlPatterns = { "/login.action" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//��ȡҳ���û����������
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String verifycode = request.getParameter("verifyCode");
			
			//��ȡϵͳ�������֤��
			HttpSession session = request.getSession();
			String sysVerifyCode = (String)session.getAttribute("randomString");
			/*
			 * ������֤
			 */
			//��֤����֤
			if(!verifycode.equalsIgnoreCase(sysVerifyCode)){
				request.setAttribute("errorinfo", "��֤�����벻��ȷ...");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return;
			}
			
			LoginInfo logininfo = new LoginInfo(username,password);
			UserIService us = new UserServiceImpl();
			int logininfoid = us.login(logininfo);
			
			if(logininfoid != 0){
				System.out.println("��½�ɹ�");
				User user = new User();
				session.setAttribute("user", user);
				session.setAttribute("logininfo", logininfo);
				//response.sendRedirect("WEB-INF/jsp/index.jsp");
				request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);
				//request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);

			}else{
				System.out.println("��½ʧ��");
				request.setAttribute("erroeinfo", "��½ʧ��");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
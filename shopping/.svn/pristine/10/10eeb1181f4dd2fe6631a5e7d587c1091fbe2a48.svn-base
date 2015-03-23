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
import com.mohan.lzcc.service.UserIService;
import com.mohan.lzcc.service.impl.UserServiceImpl;

/**
 * Servlet implementation class knif
 */
@WebServlet(description = "注册控制器", urlPatterns = { "/regist.action" })
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletrequestuest requestuest, HttpServletresponseonse responseonse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		this.doPost(request, respons);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletrequestuest requestuest, HttpServletresponseonse responseonse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 获取页面用户输入的数据
		 */
		String username = request.getParameter("regname");
		String password = request.getParameter("regpass");
		String repassword = request.getParameter("regrepass");
		String verifycode = request.getParameter("verifycode");
		//获取系统保存的验证码
		HttpSession session = request.getSession();
		String sysVerifyCode = (String)session.getAttribute("randomString");
		/*
		 * 数据检验
		 */
		//验证码判断
		if(!verifycode.equalsIgnoreCase(sysVerifyCode)){
			request.setAttribute("errorinfo", "验证码输入不正确...");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			return;
		}
		//判断密码与确认密码是否一样
		if(!password.equals(repassword)){
			request.setAttribute("errorinfo", "两次密码输入不一致...");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			return;
		}
		//判断密码是否为空
		if(password.trim().length()<0 || password == "" || password == null){
			request.setAttribute("errorinfo", "密码不能为空...");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			return;
		}
		//判断确认密码是否为空
		if(repassword.trim().length()<0 || repassword == "" || repassword == null){
			request.setAttribute("errorinfo", "确认密码不能为空...");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			return;
		}
		//判断账号是否为空
		if(username.trim().length()<0 || username == "" || username == null){
			request.setAttribute("errorinfo", "账号不能为空...");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			return;
		}
		
		UserIService us = new UserServiceImpl();
		
		LoginInfo li = new LoginInfo(username,password);
		int rows = 0;
		try {
		    rows = us.add(li);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rows>0){
			System.out.println("注册成功");
			response.sendRedirect("login.jsp");
		}else{
			System.out.println("注册失败");
			request.setAttribute("errorinfo", "注册失败");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
		}
	}
}



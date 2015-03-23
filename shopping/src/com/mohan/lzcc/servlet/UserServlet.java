package com.mohan.lzcc.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mohan.lzcc.model.User;
import com.mohan.lzcc.service.UserIService;
import com.mohan.lzcc.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet(description = "注册控制器", urlPatterns = { "/addInfo.action" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      UserServiceImpl us = new UserServiceImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		
		UserIService us = new UserServiceImpl();
		
		String age = request.getParameter("age");
		int iage = Integer.parseInt(age);
		String unit = request.getParameter("unit");
		String profession = request.getParameter("profession");
		User u = new User(iage,profession,unit);
		HttpSession session = request.getSession();
		try {
			int rows = us.addInfo(u);
			if(rows > 0){
				System.out.println("信息添加成功");
				request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			System.out.println("个人信息添加失败");
			request.setAttribute("errorinfo", "添加失败");
			e.printStackTrace();
		}
	}

}

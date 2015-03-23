package com.mohan.lzcc.servlet;
/**
 * 修改密码控制器
 * @author 王庆庆
 * @version 1.0
 * @since time：2014-3-18 16:23
 * 
 * @see update:
 * @see time:
 * @see content:
 */
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mohan.lzcc.dao.IDAO;
import com.mohan.lzcc.dao.impl.LoginInfoDAOImpl;
import com.mohan.lzcc.model.LoginInfo;
import com.mohan.lzcc.model.User;
import com.mohan.lzcc.service.UserIService;
import com.mohan.lzcc.service.impl.LoginInfoServiceImpl;
import com.mohan.lzcc.service.impl.UserServiceImpl;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet(description="修改密码控制器",urlPatterns={"/changepwd.action"})
public class ChangePwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    try {
			//获取页面用户输入的数据
			String oldpwd = request.getParameter("oldpwd");
			String newpwd = request.getParameter("newpwd");
			String repwd = request.getParameter("repwd");
			
			//获取session
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");
			if(user!=null){
			   LoginInfo logininfo = (LoginInfo)session.getAttribute("logininfo");
			   if(logininfo!=null){
				  if(oldpwd.equals(logininfo.getPassword())){
					  LoginInfoServiceImpl lsi = new LoginInfoServiceImpl();
					  UserIService us = new UserServiceImpl();
				      int logininfoid = us.login(logininfo);
					  lsi.changePwd(newpwd, logininfoid);
					  //session.removeAttribute(oldpwd);
					  System.out.println("修改密码成功");
					  request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);
					  //response.sendRedirect("./WEB-INF/jsp/index.jsp");
			      }else{   
			          System.out.println("修改密码失败");
					  response.sendRedirect("./customer/modifypass.jsp");
			      }
			  }  
	       }
	     }catch (SQLException e) {
			e.printStackTrace();
	   }
	}
    
	
}

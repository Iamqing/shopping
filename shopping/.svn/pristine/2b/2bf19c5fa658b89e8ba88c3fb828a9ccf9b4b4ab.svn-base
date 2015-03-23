package com.mohan.lzcc.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mohan.lzcc.model.BankCard;
import com.mohan.lzcc.model.User;
import com.mohan.lzcc.service.BankCardIService;
import com.mohan.lzcc.service.impl.BankCardServiceImpl;

/**
 * Servlet implementation class BankcardServlet
 */
@WebServlet(description = "银行卡控制器", urlPatterns = { "/bankcard.action" })
public class BankcardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankcardServlet() {
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
			//获取页面输入信息
			String cardname = request.getParameter("textfield2");
			String cardbalance = request.getParameter("textfield");
			double balance = Double.parseDouble(cardbalance);
			//获取当前登录用户
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");
			
			BankCard bc = new BankCard(user,cardname,balance); 
			
			BankCardIService bcis = new BankCardServiceImpl();
			int rows = bcis.add(bc);
			
			if(rows>0){
				System.out.println("添加成功");
				request.getRequestDispatcher("bankcard.jsp");
			}else{
				System.out.println("添加失败");
				request.getRequestDispatcher("bankcard.jsp").forward(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}

package com.mohan.lzcc.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.mohan.lzcc.dao.IDAO;
import com.mohan.lzcc.dao.impl.LoginInfoDAOImpl;
import com.mohan.lzcc.dao.impl.UserDAOImpl;
import com.mohan.lzcc.dbhelper.ConnectionManager;
import com.mohan.lzcc.model.LoginInfo;
import com.mohan.lzcc.model.User;
import com.mohan.lzcc.service.UserIService;
/**
 * 
 * @author 王历飞
 * @version 1.0
 * @time 2014-03-11 16:58
 *
 */
public class UserServiceImpl implements UserIService{
	private Connection conn;
	private IDAO<User> udao = new UserDAOImpl();
	private IDAO<LoginInfo> ldao = new LoginInfoDAOImpl();
	UserDAOImpl uDAO = new UserDAOImpl();
	@Override
	public int add(LoginInfo li) throws SQLException {
		conn = ConnectionManager.getConn();
		// 向登陆信息表中添加登陆信息数据,并返回新增的数据的主键的值
		int id = ldao.add(conn, li);
		li.setId(id);
		User user = new User(li);
		int rows = udao.add(conn, user);
		
		return rows;
	}

	@Override
	public int login(LoginInfo li) throws SQLException {
		conn = ConnectionManager.getConn();
		LoginInfo logininfo = ldao.findByNameAndPass(conn, li.getUsername(),li.getPassword());
		if(logininfo!=null){
			return logininfo.getId();
		}
		return 0;
	}

	@Override
	public int addInfo(User u) throws SQLException {
		conn = ConnectionManager.getConn();
		int rows = uDAO.addInfo(conn, u);
		return rows;
	}

}

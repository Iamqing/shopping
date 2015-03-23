package com.mohan.lzcc.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mohan.lzcc.dao.IDAO;
import com.mohan.lzcc.dao.impl.LoginInfoDAOImpl;
import com.mohan.lzcc.dbhelper.ConnectionManager;
import com.mohan.lzcc.mapper.RowMapper;
import com.mohan.lzcc.mapper.impl.LoginInfoMapper;
import com.mohan.lzcc.model.LoginInfo;
import com.mohan.lzcc.model.User;
import com.mohan.lzcc.service.LoginInfoIService;

public class LoginInfoServiceImpl implements LoginInfoIService{
	private Connection conn = null;
	private IDAO<LoginInfo> dao = new LoginInfoDAOImpl();
	private LoginInfoDAOImpl ldao = new LoginInfoDAOImpl();

	@Override
	public int add(LoginInfo li) throws SQLException {
		conn = ConnectionManager.getConn();
		return dao.add(conn, li);
	}
    /**
     * ÐÞ¸ÄÃÜÂë
     */
	public LoginInfo changePwd(String newpassword,int id) throws SQLException {
		conn = ConnectionManager.getConn();
        LoginInfo logininfo = ldao.changePwd(conn, newpassword, id);
        return logininfo;
    }

}

	
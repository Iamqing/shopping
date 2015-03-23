package com.mohan.lzcc.mapper.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mohan.lzcc.mapper.RowMapper;
import com.mohan.lzcc.model.LoginInfo;

public class LoginInfoMapper implements RowMapper<LoginInfo>{

	@Override
	public LoginInfo rowMapper(Connection conn, ResultSet rs) throws SQLException {
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setId(rs.getInt("id"));
		loginInfo.setUsername(rs.getString("username"));
		loginInfo.setPassword(rs.getString("password"));
		return loginInfo;
	}

}

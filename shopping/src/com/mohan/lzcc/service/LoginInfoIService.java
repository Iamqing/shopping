package com.mohan.lzcc.service;

import java.sql.SQLException;

import com.mohan.lzcc.model.LoginInfo;

public interface LoginInfoIService {
	int add(LoginInfo li) throws SQLException;
}

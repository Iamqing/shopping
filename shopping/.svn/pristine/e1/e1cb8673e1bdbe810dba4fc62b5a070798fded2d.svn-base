/**
 * 
 */
package com.mohan.lzcc.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.mohan.lzcc.dao.impl.BankCardDAOImpl;
import com.mohan.lzcc.dbhelper.ConnectionManager;
import com.mohan.lzcc.dbhelper.DBHelper;
import com.mohan.lzcc.model.BankCard;
import com.mohan.lzcc.service.BankCardIService;

/**
 * @author J
 * @verison 1.0
 * @time :2014Äê3ÔÂ18ÈÕ
 * 
 * @see update:
 * @see update time:
 * @see update content: 
 */
public class BankCardServiceImpl implements BankCardIService{
	private Connection conn;
	private BankCardDAOImpl dao = new BankCardDAOImpl();
	private DBHelper dh = new DBHelper();

	/* (non-Javadoc)
	 * @see com.mohan.lzcc.service.BankCardIService#add(com.mohan.lzcc.model.BankCard)
	 */
	@Override
	public int add(BankCard bankcard) throws SQLException {
		conn = ConnectionManager.getConn();
		return dao.add(conn, bankcard);
	}

}

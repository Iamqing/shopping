package com.mohan.lzcc.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.mohan.lzcc.dao.IDAO;
import com.mohan.lzcc.dbhelper.DBHelper;
import com.mohan.lzcc.model.BankCard;

/**
 * 
 * @author J
 * @version 1.0
 * @time 2014-03-11 08:41
 *
 */
public class BankCardDAOImpl implements IDAO<BankCard>{
	private String sql=null;
	private DBHelper dh = new DBHelper();

	/* (non-Javadoc)
	 * @see com.mohan.lzcc.dao.IDAO#add(java.sql.Connection, java.lang.Object)
	 */
	@Override
	public int add(Connection conn, BankCard t) throws SQLException {
		//∂®“Âsql”Ôæ‰
		sql = "insert into bankcard(userid,cardname,cardbalance) value(?,?,?)";
		//÷¥––sql”Ôæ‰
		return dh.executeSQL(conn, sql, t.getUser().getId(),t.getCardname(),t.getCardbalance());
	}

	/* (non-Javadoc)
	 * @see com.mohan.lzcc.dao.IDAO#delete(java.sql.Connection, int)
	 */
	@Override
	public int delete(Connection conn, int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mohan.lzcc.dao.IDAO#update(java.sql.Connection, java.lang.Object)
	 */
	@Override
	public int update(Connection conn, BankCard t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mohan.lzcc.dao.IDAO#findById(java.sql.Connection, int)
	 */
	@Override
	public BankCard findById(Connection conn, int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mohan.lzcc.dao.IDAO#findByNameAndPass(java.sql.Connection, java.lang.String, java.lang.String)
	 */
	@Override
	public BankCard findByNameAndPass(Connection conn, String username,
			String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mohan.lzcc.dao.IDAO#findAll(java.sql.Connection)
	 */
	@Override
	public List<BankCard> findAll(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mohan.lzcc.dao.IDAO#findByCondition(java.sql.Connection, java.lang.Object[])
	 */
	@Override
	public List<BankCard> findByCondition(Connection conn, Object... objs)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}

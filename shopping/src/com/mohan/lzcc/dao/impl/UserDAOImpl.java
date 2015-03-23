package com.mohan.lzcc.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mohan.lzcc.dao.IDAO;
import com.mohan.lzcc.dbhelper.DBHelper;
import com.mohan.lzcc.mapper.impl.LoginInfoMapper;
import com.mohan.lzcc.model.User;

/**
 * 
 * @author J
 * @version 1.0
 * @time 2014-03-11 08:45
 *
 */
public class UserDAOImpl implements IDAO<User>{
	private DBHelper dh = new DBHelper();
	private ResultSet rs = null;
	private User user = new User();
	private String sql = null;

	@Override
	public int add(Connection conn, User t) throws SQLException {
		//定义sql语句
		sql = "insert into user(logininfoid) values(?)";
		//执行sql语句
		int rows = dh.executeSQL(conn, sql, t.getLogininfo().getId());
		return rows;
	}

	@Override
	public int delete(Connection conn, int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Connection conn, User t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findById(Connection conn, int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByNameAndPass(Connection conn, String username,
			String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByCondition(Connection conn, Object... objs)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 个人设置添加个人信息
	 * @param conn
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	public int addInfo(Connection conn,User u) throws SQLException{
		sql = "insert into user(age,profession,unit) values(?,?,?)";
		System.out.println("age---" + u.getAge());
		int rows = dh.executeSQL(conn, sql, u.getAge(),u.getProfession(),u.getUnit());
		return rows;
		
	}
	
}

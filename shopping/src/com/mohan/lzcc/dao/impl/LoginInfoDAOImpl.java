package com.mohan.lzcc.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mohan.lzcc.dao.IDAO;
import com.mohan.lzcc.dbhelper.ConnectionManager;
import com.mohan.lzcc.dbhelper.DBHelper;
import com.mohan.lzcc.mapper.impl.LoginInfoMapper;
import com.mohan.lzcc.model.LoginInfo;
import com.mohan.lzcc.model.User;

/**
 * 
 * @author J
 * @version 1.0
 * @time 2014-03-11 08:43
 *
 */
public class LoginInfoDAOImpl implements IDAO<LoginInfo>{
	private DBHelper dh = new DBHelper();
	private String sql = null;
	private LoginInfo logininfo = new LoginInfo();
	private User user = new User();

	@Override
	public int add(Connection conn, LoginInfo t) throws SQLException {
		//����sql���
		sql = "insert into logininfo(username,password) values(?,?) ";
		//ִ��sql���
		int rows = dh.executeInsertGetId(conn, sql, t.getUsername(),t.getPassword());
		return rows;
	}

	@Override
	public int delete(Connection conn, int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
   
	@Override
	public int update(Connection conn,LoginInfo logininfo) throws SQLException {
		return 0;
	}
    /**
     * �����û���¼��id����
     */
	@Override
	public LoginInfo findById(Connection conn, int id) throws SQLException {
		sql = "select * from logininfo where id=?";
		ResultSet rs = dh.executeQuery(conn, sql, logininfo.getId());
		while(rs.next()){
			return new LoginInfoMapper().rowMapper(conn, rs);
		}
		return logininfo;
	}

	@Override
	public LoginInfo findByNameAndPass(Connection conn, String username,
			String password) throws SQLException {
		//����sql���
		sql = "select * from logininfo where username = ? and password = ?";
		//ִ��sql���
		ResultSet rs = dh.executeQuery(conn, sql, username,password);
		
		LoginInfo li = null;
		while(rs.next()){
//			li = new LoginInfo();
//			LoginInfoMapper lim = new LoginInfoMapper();
//			li = lim.rowMapper( conn, rs);
			//li.setId(rs.getInt("id"));
			//li.setUsername(rs.getString("username"));
			//li.setPassword(rs.getString("password"));
		    return new LoginInfoMapper().rowMapper(conn, rs);
		}
		return li;
	}

	@Override
	public List<LoginInfo> findAll(Connection conn) throws SQLException {
		return null;
	}

	@Override
	public List<LoginInfo> findByCondition(Connection conn, Object... objs)
			throws SQLException {
		return null;
	}
	 /**
     * �޸�����
     */
	public LoginInfo changePwd(Connection conn,String newpassword,int id) throws SQLException{
		sql = "update logininfo set password=? where id=?";
        int rows = dh.executeSQL(conn, sql,newpassword,id);
		return logininfo;
	}
}

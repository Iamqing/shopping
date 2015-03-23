package com.mohan.lzcc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.mohan.lzcc.model.LoginInfo;
/**
 * 
 * @author J
 * @version
 * @time 2014-03-11 08:40
 *
 * @param <T>
 */
public interface IDAO<T> {
	/**
	 * 
	 * @param conn
	 * @param t
	 * @return
	 * @throws SQLException
	 */
	int add(Connection conn, T t) throws SQLException;
	/**
	 * 
	 * @param conn
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	int delete(Connection conn,int id) throws SQLException;
	/**
	 * 
	 * @param conn
	 * @param t
	 * @return
	 * @throws SQLException
	 */
	int update(Connection conn,T t) throws SQLException;
	/**
	 * 
	 * @param conn
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	T findById(Connection conn,int id) throws SQLException;
	/**
	 * 
	 * @param conn
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	T findByNameAndPass(Connection conn,String username,String password) throws SQLException;
	/**
	 * 
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	List<T> findAll(Connection conn) throws SQLException;
	/**
	 * 
	 * @param conn
	 * @param objs
	 * @return
	 * @throws SQLException
	 */
	List<T> findByCondition(Connection conn,Object...objs) throws SQLException;
	
}

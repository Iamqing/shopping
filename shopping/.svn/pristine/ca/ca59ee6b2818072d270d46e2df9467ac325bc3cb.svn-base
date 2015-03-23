package com.mohan.lzcc.dbhelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @author 王历飞
 * @version 1.0
 * @time 2014-03-11 08:36
 */
public class DBHelper {
	/**
	 * 执行增、删、改，返回执行记录行数的方法
	 * @param conn	数据库连接
	 * @param sql	要执行的sql语句
	 * @param parameters	参数
	 * @return	返回执行的记录行数
	 * @throws SQLException 可能产生sql异常 
	 */
	public int executeSQL(Connection conn, String sql, Object ... parameters) throws SQLException {
		pstat = conn.prepareStatement(sql);// 获取预编译对象
		setParameter(parameters);// 设置参数
		return pstat.executeUpdate();// 执行sql语句
	}
	/**
	 * 执行插入数据并返回新生成的主键id的方法
	 * @param conn	数据库连接
	 * @param sql	要执行的sql语句
	 * @param parameters	插入数据时的参数
	 * @return	返回执行后新生成的主键的值
	 * @throws SQLException 可能产生sql异常
	 */
	public int executeInsertGetId(Connection conn, String sql, Object ... parameters) throws SQLException {
		pstat = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);// 获取预编译对象
		setParameter(parameters);// 设置参数
		pstat.executeUpdate();// 执行sql
		
		rs = pstat.getGeneratedKeys();// 获取生成的主键的结果集
		if (rs.next()) {
			return rs.getInt(1);// 获取并返回新生成的主键
		}
		return -1;
	}
	
	/**
	 * 执行查询的方法
	 * @param conn 数据库连接
	 * @param sql	要执行的sql语句
	 * @param parameters	查询操作中用到的参数
	 * @return	返回执行查询得到的结果集
	 * @throws SQLException 
	 */
	public ResultSet executeQuery(Connection conn, String sql, Object ... parameters) throws SQLException {
		pstat = conn.prepareStatement(sql);// 获取预编译对象
		setParameter(parameters);// 设置参数
		return pstat.executeQuery();// 执行查询并返回查询的结果集
	}
	
	/**
	 * 私有的设置参数的方法
	 * @param parameters
	 * @throws SQLException
	 */
	private void setParameter(Object ... parameters) throws SQLException {
		if(parameters != null && parameters.length > 0) {
			for (int i = 0; i < parameters.length; i++) {
				pstat.setObject(i + 1, parameters[i]);
			}
		}
	}
	
	// 预编译执行sql语句的变量
	private PreparedStatement pstat;
	// 数据库查询返回结果集的变量
	private ResultSet rs;
}

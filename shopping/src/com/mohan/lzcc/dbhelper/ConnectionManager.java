package com.mohan.lzcc.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * 
 * @author 王历飞
 * @version 1.0
 * @time 2014-03-11 08:37
 *
 */
public class ConnectionManager {
	/*
	 * ThreadLocal对象，用于指导某一些数据资源和当前线程的绑定关系
	 * 说明这些数据只能是当前线程使用，其他线程不能使用
	 */
	//声明一个ThreadLocal的单列对象，用于保存当前线程使用的数据库链接
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	// 1. 加载驱动
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.err.println("警告：驱动加载失败...");
			}
		}

		// 2. 获取连接
		public static Connection getConn() throws SQLException {
			//return DriverManager
			//		.getConnection("jdbc:mysql://localhost:3306/pxhome?user=root&password=root&useUnicode=true&characterEncoding=GB18030");
			//return DriverManager
			//		.getConnection("jdbc:mysql://localhost:3306/books","root","root");
			Connection conn = threadLocal.get();
			if(conn == null){
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","root");
				threadLocal.set(conn);
			}
			return conn;
		}

		// 3. 释放连接
		public static void free(Connection conn) {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				System.err.println("警告：数据库连接关闭失败...");
			}
		}

}

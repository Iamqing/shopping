package com.mohan.lzcc.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * 
 * @author ������
 * @version 1.0
 * @time 2014-03-11 08:37
 *
 */
public class ConnectionManager {
	/*
	 * ThreadLocal��������ָ��ĳһЩ������Դ�͵�ǰ�̵߳İ󶨹�ϵ
	 * ˵����Щ����ֻ���ǵ�ǰ�߳�ʹ�ã������̲߳���ʹ��
	 */
	//����һ��ThreadLocal�ĵ��ж������ڱ��浱ǰ�߳�ʹ�õ����ݿ�����
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	// 1. ��������
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.err.println("���棺��������ʧ��...");
			}
		}

		// 2. ��ȡ����
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

		// 3. �ͷ�����
		public static void free(Connection conn) {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				System.err.println("���棺���ݿ����ӹر�ʧ��...");
			}
		}

}

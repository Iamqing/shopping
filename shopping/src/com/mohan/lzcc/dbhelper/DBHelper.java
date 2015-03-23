package com.mohan.lzcc.dbhelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @author ������
 * @version 1.0
 * @time 2014-03-11 08:36
 */
public class DBHelper {
	/**
	 * ִ������ɾ���ģ�����ִ�м�¼�����ķ���
	 * @param conn	���ݿ�����
	 * @param sql	Ҫִ�е�sql���
	 * @param parameters	����
	 * @return	����ִ�еļ�¼����
	 * @throws SQLException ���ܲ���sql�쳣 
	 */
	public int executeSQL(Connection conn, String sql, Object ... parameters) throws SQLException {
		pstat = conn.prepareStatement(sql);// ��ȡԤ�������
		setParameter(parameters);// ���ò���
		return pstat.executeUpdate();// ִ��sql���
	}
	/**
	 * ִ�в������ݲ����������ɵ�����id�ķ���
	 * @param conn	���ݿ�����
	 * @param sql	Ҫִ�е�sql���
	 * @param parameters	��������ʱ�Ĳ���
	 * @return	����ִ�к������ɵ�������ֵ
	 * @throws SQLException ���ܲ���sql�쳣
	 */
	public int executeInsertGetId(Connection conn, String sql, Object ... parameters) throws SQLException {
		pstat = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);// ��ȡԤ�������
		setParameter(parameters);// ���ò���
		pstat.executeUpdate();// ִ��sql
		
		rs = pstat.getGeneratedKeys();// ��ȡ���ɵ������Ľ����
		if (rs.next()) {
			return rs.getInt(1);// ��ȡ�����������ɵ�����
		}
		return -1;
	}
	
	/**
	 * ִ�в�ѯ�ķ���
	 * @param conn ���ݿ�����
	 * @param sql	Ҫִ�е�sql���
	 * @param parameters	��ѯ�������õ��Ĳ���
	 * @return	����ִ�в�ѯ�õ��Ľ����
	 * @throws SQLException 
	 */
	public ResultSet executeQuery(Connection conn, String sql, Object ... parameters) throws SQLException {
		pstat = conn.prepareStatement(sql);// ��ȡԤ�������
		setParameter(parameters);// ���ò���
		return pstat.executeQuery();// ִ�в�ѯ�����ز�ѯ�Ľ����
	}
	
	/**
	 * ˽�е����ò����ķ���
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
	
	// Ԥ����ִ��sql���ı���
	private PreparedStatement pstat;
	// ���ݿ��ѯ���ؽ�����ı���
	private ResultSet rs;
}

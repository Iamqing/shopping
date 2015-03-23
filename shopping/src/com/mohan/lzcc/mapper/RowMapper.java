package com.mohan.lzcc.mapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public interface RowMapper<T> {
	T rowMapper(Connection conn,ResultSet rs) throws SQLException;
}

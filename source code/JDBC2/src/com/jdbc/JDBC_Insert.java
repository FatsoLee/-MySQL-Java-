package com.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {
	public static void main(String[] args) {
		Statement st=null;
		
		st=Utils.getSt();
		try {
			//4��ִ��
			String sql="insert into employee values()";
			int num=st.executeUpdate(sql);
			
			//5������ִ�н��
			System.out.println(num);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			Utils.close(st);
		}
	}
}

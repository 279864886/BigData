package com.sast.bigdata.util;

import java.sql.*;

public class SqlServerUtil {
    //��ȡ���ݿ�����

    public static Connection getConnection(){
        Connection conn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=804_C6", "sa", "123456789a+");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //�ر�������Դ
    public static void closeAll(ResultSet rs, Statement stmt, Connection conn){
        MysqlUtil.closeAll(rs,stmt,conn);
    }
}

package com.sast.bigdata.util;

import java.sql.*;

public class SqlServerUtil {
    //获取数据库连接

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

    //关闭所有资源
    public static void closeAll(ResultSet rs, Statement stmt, Connection conn){
        MysqlUtil.closeAll(rs,stmt,conn);
    }
}

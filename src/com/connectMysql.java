package com;

import java.sql.*;
/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 19616
 * @Date 2021/1/29 16:37
 */
public class connectMysql {
    Connection con;

    public Connection getCon() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            System.out.println("连接失败");
        }

        // 2.设置好IP/端口/数据库名/用户名/密码等必要的连接信息
        String ip = "192.168.2.226"; //localhost
        int port = 3306;
        String dbName = "test";
        String url = "jdbc:mysql://" + ip + ":" + port
                + "/" + dbName;
        // 构建连接mysql的字符串
        String user = "root";
        String password = "xs196166";

        // 3.连接JDBC
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("ok");
        }
        catch (SQLException e) {
            System.out.println("no");
        }
        return con;
    }

    public static void search() throws SQLException {
        connectMysql c = new connectMysql();
        Connection testCon = c.getCon();
        Statement sql = testCon.createStatement();
        ResultSet res = sql.executeQuery("select sname from student");
        while(res.next()) {
            System.out.println(res.getString("sname"));
        }

    }


    public static void main(String[] args) throws SQLException {
        connectMysql.search();

    }

}

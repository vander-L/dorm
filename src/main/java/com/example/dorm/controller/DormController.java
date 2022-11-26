package com.example.dorm.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DormController{
    @ResponseBody
    @RequestMapping()
    public String SetRet() throws JSONException {

        //设定数据库驱动，数据库连接地址、端口、名称，用户名，密码  
        String driverName = "oracle.jdbc.driver.OracleDriver";
        /*172.18.1.252是我自己建的一个数据库的地址，你在自己电脑建
        的数据库直接localhost就可以了，ORA9IS为数据库名称（一般默认
        为orcl），1521为连接数据库的默认端口*/
        String url = "jdbc:oracle:thin:@172.30.192.246:1521:dorm";
        String user = "system";   //xxx为你的用户名
        String password = "Admin123";  //xxx为你的密码

        Statement stmt = null;
        ResultSet rs = null;

        //数据库连接对象  
        Connection conn = null;

        String jsonStr = null;
        try {
            //反射Oracle数据库驱动程序类  
            Class.forName(driverName);
            //获取数据库连接  
            conn = DriverManager.getConnection(url, user, password);
            //输出数据库连接  
            System.out.println(conn);
            //驱动所查询的表
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from A_DORM");
            //声明JSONObject对象
            JSONObject json = new JSONObject();
            //声明JSONArray数组对象，注意声明对象相对循环的位置，不然可能导致循环失常
            JSONArray jay = new JSONArray();
            //将指针移到下一行，判断rs中是否有数据
            while (rs.next()) {
                //声明JSONObject对象，这里存放的信息即将存放到JSONArray中
                JSONObject json1 = new JSONObject();
                //输出字符串信息
                //System.out.println("查询到id为【" + rs.getString("ID") + "】的信息，其姓名为：" + rs.getString("cname") + ",其性别为：" + rs.getString("csex"));
                //拼各个列的json信息
                json1.put("ID", rs.getString("ID"));
                json1.put("NAME", rs.getString("NAME"));
                json1.put("LEADER_ID", rs.getString("LEADER_ID"));
                json1.put("FLOOR", rs.getString("FLOOR"));
                json1.put("NUM_ALL", rs.getString("NUM_ALL"));
                json1.put("NUM_ACTUAL", rs.getString("NUM_ACTUAL"));
                json1.put("NUM_LEFT", rs.getString("NUM_LEFT"));
                json1.put("BUILDING_ID", rs.getString("BUILDING_ID"));
                json1.put("WATER", rs.getString("WATER"));
                json1.put("ELECTRICITY", rs.getString("ELECTRICITY"));
                json1.put("DELETED", rs.getString("DELETED"));
                jay.add(json1);
            }
            json.put("INFO", jay);
            //转换成字符串形式
            jsonStr = json.toString();
            //输出字符串
            System.out.println("json = " + jsonStr);
            //解析json，遇到大括号，用JSONObject

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return jsonStr;
    }
    public static void main(String[] args) throws JSONException{
        new DormController().SetRet();
    }
}
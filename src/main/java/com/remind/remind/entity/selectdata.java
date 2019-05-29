package com.remind.remind.entity;

import com.remind.remind.Dao.baseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class selectdata{
    static ResultSet rs=null;
    Connection cnt=null;
    PreparedStatement ps=null;
    public static boolean cheliangnianshen(String StartDate, String EndDate) {
        String sql="select openid,号牌号码,下次年检 from cars,customer where USER_FORM_INFO_FLAG_MOBILE=phone and 下次年检 is not null and 下次年检 between '"+StartDate+"' and '"+EndDate+"'";
        rs= baseDao.ExecuteQuery(sql);
        try {
            int i=0;
            while(rs.next()){
                i++;
                String endenddate=rs.getString("下次年检");
                String number=rs.getString("号牌号码");
                String openid=rs.getString("openid");
                reminddemo.postremindnianshen(openid, endenddate, number);
            }
            System.out.println("发送车辆年审提醒："+i+"条");
            rs.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }finally{

            baseDao.closeResource();
        }
        return false;
    }

    public static boolean jiaoqiangxian(String StartDate, String EndDate) {
        String sql="select openid,号牌号码,enddata from insurance,customer where insurance='交强险' and phone=USER_FORM_INFO_FLAG_MOBILE and enddata between '"+StartDate+"' and '"+EndDate+"' group by phone,openid,号牌号码,enddata";
        rs= baseDao.ExecuteQuery(sql);
        try {
            int i=0;
            while(rs.next()){
                i++;
                String enddate=rs.getString("enddata");
                System.out.println(enddate);
                String number=rs.getString("号牌号码");
                String openid=rs.getString("openid");
                reminddemo.postremindbaoxian(openid, enddate, number,"交强险");
            }
            System.out.println("发送交强险到期提醒："+i+"条");
            rs.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }finally{

            baseDao.closeResource();
        }
        return false;
    }
    protected static boolean shangyexian(String StartDate, String EndDate) {
        String sql="select openid,号牌号码,enddata from insurance,customer where insurance!='交强险' and phone=USER_FORM_INFO_FLAG_MOBILE and enddata between '"+StartDate+"' and '"+EndDate+"' group by phone,openid,号牌号码,enddata";
        rs= baseDao.ExecuteQuery(sql);
        try {
            int i=0;
            while(rs.next()){
                i++;
                String endenddate=rs.getString("enddata");
                String number=rs.getString("号牌号码");
                String openid=rs.getString("openid");
                reminddemo.postremindbaoxian(openid, endenddate, number,"商业险");
            }
            System.out.println("发送交强险到期提醒："+i+"条");
            rs.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }finally{

            baseDao.closeResource();
        }
        return false;
    }

    public static boolean jiazhaonianshen(String defaultStartDate, String defaultEndDate) {
        String sql="select openid,准驾车型,有效期至,姓名,初次领证日期 from driving_licence,customer where phone=USER_FORM_INFO_FLAG_MOBILE and 有效期至 between '"+defaultStartDate+"' and '"+defaultEndDate+"'";
        rs= baseDao.ExecuteQuery(sql);
        try {
            int i=0;
            while(rs.next()){
                i++;
                String endenddate=rs.getString("有效期至");
                String name=rs.getString("姓名");
                String openid=rs.getString("openid");
                String chexing=rs.getString("准驾车型");
                String first=rs.getString("初次领证日期");
                reminddemo.postjiazhaonianshen(openid,endenddate, name,chexing,first);
            }
            System.out.println("发送驾照到期提醒："+i+"条");
            rs.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }finally{

            baseDao.closeResource();
        }
        return false;
    }
}

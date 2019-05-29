package com.remind.remind.entity;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
@EnableScheduling
@Configurable
public class test extends selectdata {
//    @Scheduled(fixedRate = 1000 * 1)
    public void test5(){
        Date dNow = new Date();   //当前时间
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.MONTH, -3);  //设置为前3月
        dBefore = calendar.getTime();   //得到前3月的时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM"); //设置时间格式
        String defaultStartDate = sdf.format(dBefore);    //格式化前3月的时间
        String defaultEndDate = sdf.format(dNow); //格式化当前时间
        System.out.println("三个月之前时间======="+defaultStartDate);
        System.out.println("当前时间==========="+defaultEndDate);
    }
    @Scheduled(cron = "0 0 9 1 * ?")
    public void test1(){
       //检查年审需要车辆
        Date dNow = new Date();   //当前时间
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.MONTH, -3);  //设置为前3月
        dBefore = calendar.getTime();   //得到前3月的时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM"); //设置时间格式
        String defaultStartDate = sdf.format(dBefore);    //格式化前3月的时间
        String defaultEndDate = sdf.format(dNow); //格式化当前时间
        System.out.println("三个月之前时间======="+defaultStartDate);
        System.out.println("当前时间==========="+defaultEndDate);
        if (selectdata.cheliangnianshen(defaultStartDate,defaultEndDate))
        {
            System.out.println("车辆年审检查完毕!");
        }
    }
    @Scheduled(cron = "0 0 9 ? * 2")
    public void test2(){
        //检查检查保险到期
        Date dNow = new Date();   //当前时间
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.MONTH, -3);  //设置为前3月
        dBefore = calendar.getTime();   //得到前3月的时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        String defaultStartDate = sdf.format(dBefore);    //格式化前3月的时间
        String defaultEndDate = sdf.format(dNow); //格式化当前时间
        System.out.println("三个月之前时间======="+defaultStartDate);
        System.out.println("当前时间==========="+defaultEndDate);
        //检查交强险是否到期
        if (selectdata.jiaoqiangxian(defaultStartDate,defaultEndDate))
        {
            System.out.println("交强险检查完毕!");
        }
        if (selectdata.shangyexian(defaultStartDate,defaultEndDate))
        {
            System.out.println("商业险检查完毕!");
        }
    }
    @Scheduled(cron = "0 0 9 ? * 2")
    public void test3(){
        //检查驾照年审
        Date dNow = new Date();   //当前时间
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.MONTH, -3);  //设置为前3月
        dBefore = calendar.getTime();   //得到前3月的时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        String defaultStartDate = sdf.format(dBefore);    //格式化前3月的时间
        String defaultEndDate = sdf.format(dNow); //格式化当前时间
        System.out.println("三个月之前时间======="+defaultStartDate);
        System.out.println("当前时间==========="+defaultEndDate);
        //检查交强险是否到期
        if (selectdata.jiazhaonianshen(defaultStartDate,defaultEndDate))
        {
            System.out.println("驾照年审检查完毕!");
        }
    }
}

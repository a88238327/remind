package com.remind.remind;

import com.remind.remind.entity.selectdata;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RemindApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemindApplication.class, args);
        System.out.println("提醒功能上线");
//        selectdata.jiazhaonianshen("2000/07/15","2030/05/22");
//        selectdata.cheliangnianshen("2000/07","2050/05");
//        selectdata.jiaoqiangxian("2000-07-15","2030-05-22");
//        selectdata.shangyexian("2000-07-15","2030-05-22");
    }

}

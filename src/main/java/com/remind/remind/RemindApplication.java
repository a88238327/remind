package com.remind.remind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RemindApplication  {

    public static void main(String[] args) {
        SpringApplication.run(RemindApplication.class, args);
        System.out.println("提醒功能上线");
    }

}

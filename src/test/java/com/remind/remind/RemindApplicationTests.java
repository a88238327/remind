package com.remind.remind;

import com.remind.remind.entity.selectdata;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RemindApplicationTests {

    @Test
    public void contextLoads() {

        selectdata.jiazhaonianshen("2021/07/15","2030-05-22");

    }

}

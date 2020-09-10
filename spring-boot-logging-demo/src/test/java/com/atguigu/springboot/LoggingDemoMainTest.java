package com.atguigu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gawain chen
 * @version 1.0
 * @email chenjia_hust@163.com
 * @date 2020/8/30 19:07
 */
@RunWith(SpringRunner.class)
public class LoggingDemoMainTest {
    Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads(){
        log.trace("this is trace log");
        log.debug("this is debug log");
        log.info("this is info log");
    }
}

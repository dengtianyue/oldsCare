package com;

import com.oldsCare.util.ApplicationContextUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestBase extends AbstractJUnit4SpringContextTests {
    @Resource
    protected ApplicationContext ac;
    @Before
    public void beforeAll() {
        System.out.println("----------Test Method Start---------");
        System.out.println(">");
        System.out.println(">");
        System.out.println(">");

        ApplicationContextUtil.setApplicationContext(ac);
    }

    @After
    public void afterAll() {
        System.out.println(">");
        System.out.println(">");
        System.out.println(">");
        System.out.println("----------Test Method End---------");
    }
}

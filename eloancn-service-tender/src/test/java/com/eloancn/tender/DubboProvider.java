package com.eloancn.tender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gwr
 * Description
 * Path com.eloancn.tender.DubboProvider
 * Date 2016/8/13
 * Time 20:12
 */
public class DubboProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(DubboProvider.class);

    public static void main(String[] args) {
        try {
            LOGGER.error("DubboProvider.main");
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
//            Object tenderRecordAPI = context.getBean("tenderRecordAPI");
//            System.out.println("tenderRecordAPI = " + tenderRecordAPI);
            context.start();
        } catch (Exception e) {
            LOGGER.error("== DubboProvider context start error:", e);
        }
        synchronized (DubboProvider.class) {
            while (true) {
                try {
                    DubboProvider.class.wait();
                } catch (InterruptedException e) {
                    LOGGER.error("== synchronized error:", e);
                }
            }
        }
    }
}
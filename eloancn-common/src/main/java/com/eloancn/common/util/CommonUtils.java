package com.eloancn.common.util;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gwr
 * DESCRIPTION
 * PACKAGE_NAME com.eloancn.trust.common.util
 * DATE 2016/6/17
 * TIME 17:02
 */
public class CommonUtils {

    private static Logger logger = LoggerFactory.getLogger(CommonUtils.class);
    public static void printObj2Json(Object obj, Logger log) {
        if (obj == null) {
            log.info("obj is null");
            return;
        }
        if (obj instanceof String) {
            log.info("obj_{}",obj);
            return;
        }
        log.info("obj_{}", JSON.toJSONString(obj));
    }
    public static void printObj2Json(Object obj) {
        printObj2Json(obj, logger);
    }
    /**
     * 将对象转换为JSON
     * @param obj
     * @return
     */
    public static String obj2Json(Object obj) {
        return JSON.toJSONString(obj);
    }
}

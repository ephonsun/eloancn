package com.eloancn.common.web.interceptor;

import com.eloancn.common.util.CommonUtils;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import java.util.Map;

/**
 * Created by gwr
 * DESCRIPTION
 * PACKAGE_NAME com.eloancn.trust.common.web.interceptor
 * DATE 2016/6/17
 * TIME 17:01
 */
public class GlobalInterceptor implements WebRequestInterceptor {
    private static Logger logger = LoggerFactory.getLogger(GlobalInterceptor.class);
    @Override
    public void preHandle(WebRequest request) throws Exception {
        printReqLog(request);
        logger.info("1");
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        logger.info("2");
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {
        logger.info("3");
    }

    /**
     * 打印访问参数
     *
     * @param request
     */
    private void printReqLog(WebRequest request) {
        Map<String, String[]> stringMap = Validate.notNull(request.getParameterMap());
        CommonUtils.printObj2Json(stringMap);
    }
}

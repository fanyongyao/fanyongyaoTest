package com.jlt.analysis.filter;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OpenApiFilter extends HandlerInterceptorAdapter{

    /**
     * 访问key
     */
    private static String APP_KEY ="appkey";

    /**
     * 时间戳
     */
    private static String TIMESTAMP ="timestamp";

    /**
     * 签名
     */
    private static String SIGN ="sign";

    /**
     * 请求超时
     */
    private static Long REQUEST_TIME_OUT = 10*60*1000l;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return true;
    }

}

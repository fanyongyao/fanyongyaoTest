package com.jlt.analysis.controller;

import com.alibaba.fastjson.JSONObject;
import com.jlt.analysis.model.LogSend;
import com.jlt.analysis.service.LogSendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;


/**
 * 
 * 
 * @author czx
 * @email object_czx@163.com
 * @date 2018-06-20 18:44:04
 */
@RestController
@RequestMapping("/logsend")
public class LogSendController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private LogSendService logSendService;

    /**
     * 登录认证记录新增
     * @param logSend
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/loginSave", method = RequestMethod.POST)
    public String loginSave(@RequestBody LogSend logSend,HttpServletRequest request){
        try {
            logger.info("登录记录数据收集参数:", JSONObject.toJSONString(logSend));
            String mno = logSend.getMno();
            String str = new String(mno.getBytes(),"utf-8");
            logSend.setMno(str);
            String result = logSendService.loginSave(logSend);
            if ("success".equals(result)){
                logger.info("登录记录数据收集成功:",request);
            }else{
                logger.info("登录记录数据收集失败:",request);
            }
            return result;
        } catch (UnsupportedEncodingException e) {
            logger.info("登录记录数据收集失败",e.getMessage());
            e.printStackTrace();
            return "error";
        }
    }
	
}

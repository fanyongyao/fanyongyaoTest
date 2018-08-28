package com.jlt.analysis.service;

import com.jlt.analysis.mapper.LogSendMapper;
import com.jlt.analysis.model.LogSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 
 * 
 * @author czx
 * @email object_czx@163.com
 * @date 2018-06-20 18:44:04
 */
@Service
public class LogSendService {
    @Autowired
    private LogSendMapper logSendMapper;

    /**
     * 用户认证记录新增
     * @param logSend
     * @return
     */
    public String loginSave(LogSend logSend) {
        logSend.setCreateTime(new Date());
        logSend.setTimesTamp(new Date());
        int insert = logSendMapper.insert(logSend);
        if (insert>0){
            return "success";
        }else {
            return "error";
        }
    }
}

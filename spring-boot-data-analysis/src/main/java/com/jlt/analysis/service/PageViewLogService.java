package com.jlt.analysis.service;

import com.jlt.analysis.mapper.FirstinStallMapper;
import com.jlt.analysis.mapper.PageViewLogMapper;
import com.jlt.analysis.model.FirstinStall;
import com.jlt.analysis.model.PageViewLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * @author czx
 * @email object_czx@163.com
 * @date 2018-06-20 18:44:04
 */
@Service
public class PageViewLogService {
	@Autowired
    private PageViewLogMapper pageViewLogMapper;


    public String insert(PageViewLog pageViewLog) {
        int result = pageViewLogMapper.insert(pageViewLog);
        if (result>0){
            return "success";
        }else {
            return "error";
        }
    }
}

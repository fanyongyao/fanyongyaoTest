package com.jlt.analysis.service;

import com.jlt.analysis.mapper.FirstinStallMapper;
import com.jlt.analysis.model.FirstinStall;
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
public class FirstinStallService {
	@Autowired
    private FirstinStallMapper firstinStallMapper;

    public String insertOpen(FirstinStall firstinStall) {
        int result = firstinStallMapper.insert(firstinStall);
        if (result>0){
            return "success";
        }else {
            return "error";
        }
    }
}

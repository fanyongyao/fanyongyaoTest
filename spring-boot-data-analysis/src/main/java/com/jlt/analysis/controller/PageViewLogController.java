package com.jlt.analysis.controller;

import com.alibaba.fastjson.JSONObject;
import com.jlt.analysis.model.FirstinStall;
import com.jlt.analysis.model.FirstinStallListVo;
import com.jlt.analysis.model.FirstinStallVo;
import com.jlt.analysis.model.PageViewLog;
import com.jlt.analysis.service.FirstinStallService;
import com.jlt.analysis.service.PageViewLogService;
import java.util.Date;
import java.util.List;
import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 
 * 
 * @author czx
 * @email object_czx@163.com
 * @date 2018-06-20 18:44:04
 */
@RestController
@RequestMapping("/pageViewLog")
public class PageViewLogController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PageViewLogService pageViewLogService;




    /**
     * 第一次打开app的时候
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/notice", method = RequestMethod.POST)
    public String open(@RequestBody PageViewLog pageViewLog){
        logger.info("装机记录数据收集参数:", JSONObject.toJSONString(pageViewLog));
        String result = pageViewLogService.insert(pageViewLog);
        if("success".equals(result)){
            logger.info("装机记录数据收集成功:",result);
        }else {
            logger.info("装机记录书记收集失败",result);
        }
        return result;
    }

	
}

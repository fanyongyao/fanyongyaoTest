package com.jlt.analysis.controller;

import com.alibaba.fastjson.JSONObject;
import com.jlt.analysis.model.FirstinStall;
import com.jlt.analysis.model.FirstinStallListVo;
import com.jlt.analysis.model.FirstinStallVo;
import com.jlt.analysis.service.FirstinStallService;
import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


/**
 * 
 * 
 * @author czx
 * @email object_czx@163.com
 * @date 2018-06-20 18:44:04
 */
@RestController
@RequestMapping("/firstinstall")
public class FirstinStallController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private FirstinStallService firstinStallService;




    /**
     * 第一次打开app的时候
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/open", method = RequestMethod.POST)
    public String open(@RequestBody FirstinStallVo firstinStallVo){
        logger.info("装机记录数据收集参数:", JSONObject.toJSONString(firstinStallVo));
        FirstinStall firstinStall=new FirstinStall();
        List<FirstinStallListVo> appList = firstinStallVo.getAppList();
        JSONArray listArray= JSONArray.fromObject(appList);
        firstinStall.setAppList(listArray.toString());
        firstinStall.setCreateTime(new Date());
        firstinStall.setGps(firstinStallVo.getGps());
        firstinStall.setDeviceos(firstinStallVo.getDeviceos());
        firstinStall.setFirm(firstinStallVo.getFirm());
        firstinStall.setAppId(firstinStallVo.getAppId());
        firstinStall.setAppVersion(firstinStallVo.getAppVersion());
        firstinStall.setDeviceHd(firstinStallVo.getDeviceHd());
        Long loadingDate = firstinStallVo.getLoadingTime();
        Date date=new Date(loadingDate);
        //Date date = DateUtils.parseDates(loadingDate);
        firstinStall.setLoadingTime(date);
        firstinStall.setDeviceId(firstinStallVo.getDeviceId());
        firstinStall.setOsType(firstinStallVo.getOsType());
        String result = firstinStallService.insertOpen(firstinStall);
        if("success".equals(result)){
            logger.info("装机记录数据收集成功:",result);
        }else {
            logger.info("装机记录书记收集失败",result);
        }
        return result;
    }

	
}

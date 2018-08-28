package com.jlt.analysis.controller;

import com.alibaba.fastjson.JSONObject;
import com.jlt.analysis.model.Authentification;
import com.jlt.analysis.service.AuthentificationService;
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
@RequestMapping("/authentification")
public class AuthentificationController {
    private Logger logger = LoggerFactory.getLogger(AuthentificationController.class);
    @Autowired
    private AuthentificationService authentificationService;

    /**
     * 实名认证记录新增
     * @param authentification
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/certificateSave", method = RequestMethod.POST)
    public String certificateSave(@RequestBody Authentification authentification){
        logger.info("实名认证数据收集参数:", JSONObject.toJSONString(authentification));
        String result= authentificationService.certificateSave(authentification);
        if ("success".equals(result)){
            logger.info("实名认证数据收集成功:",result);
        }else {
            logger.info("实名认证数据收集失败",result);
        }
        return  result;


    }

}

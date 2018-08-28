package com.jlt.analysis.controller;

import com.alibaba.fastjson.JSONObject;
import com.jlt.analysis.model.ImportWallet;
import com.jlt.analysis.service.ImportWalletService;
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
@RequestMapping("/importwallet")
public class ImportWalletController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ImportWalletService importWalletService;

    /**
     * 新增创建钱包记录
     * @param importWallet
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/createWalleted", method = RequestMethod.POST)
    public String createWalleted(@RequestBody ImportWallet importWallet){
        logger.info("创建钱包数据收集参数",JSONObject.toJSONString(importWallet));
        return importWalletService.insertCreateWalleted(importWallet);
    }


    /**
     * 导入钱包记录
     * @param importWallet
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/importWalleted", method = RequestMethod.POST)
    public String importWalleted(@RequestBody ImportWallet importWallet){
        logger.info("导入钱包记录参数:", JSONObject.toJSONString(importWallet));
        return importWalletService.insertImportWalleted(importWallet);
    }
}

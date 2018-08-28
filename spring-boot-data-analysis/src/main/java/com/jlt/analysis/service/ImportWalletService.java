package com.jlt.analysis.service;

import com.jlt.analysis.mapper.ImportWalletMapper;
import com.jlt.analysis.model.ImportWallet;
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
public class ImportWalletService {
	@Autowired
    private ImportWalletMapper importWalletMapper;

    /**
     * 导入钱包记录
     * @param importWallet
     * @return
     */
    public String insertImportWalleted(ImportWallet importWallet) {
        importWallet.setCreateTime(new Date());
        int insert = importWalletMapper.insert(importWallet);
        if(insert>0){
            return "success";
        }else{
            return "error";
        }
    }

    /**
     * 创建钱包记录
     * @param importWallet
     * @return
     */
    public String insertCreateWalleted(ImportWallet importWallet) {
        importWallet.setCreateTime(new Date());
        int insert = importWalletMapper.insert(importWallet);
        if(insert>0){
            return "success";
        }else{
            return "error";
        }
    }
}

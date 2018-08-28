package com.jlt.analysis.service;


import com.jlt.analysis.mapper.AuthentificationMapper;
import com.jlt.analysis.model.Authentification;
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
public class AuthentificationService {
	@Autowired
    private AuthentificationMapper authentificationMapper;

    /**
     *
     * @param authentification
     * @return
     */
    public String certificateSave(Authentification authentification) {
        authentification.setCreateTime(new Date());
        authentification.setTimesTamp( new Date());
        int result = authentificationMapper.insert(authentification);
        if (result>0){
            return "success";
        }else {
            return "error";
        }
    }
}

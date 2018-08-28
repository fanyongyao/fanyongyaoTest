/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.jlt.analysis.common.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;


public class CustomerAuthenticationToken extends UsernamePasswordToken {

    private String captcha;

    private String loginType;

    private String loginForm;

    public CustomerAuthenticationToken(String username, String password, boolean rememberMe) {
        super(username, password, rememberMe);
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getLoginForm() {
        return loginForm;
    }

    public void setLoginForm(String loginForm) {
        this.loginForm = loginForm;
    }
}


package com.jlt.analysis.filter;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class AdminFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    public void setLoginUrl(String loginUrl) {
        super.setLoginUrl("/customer/accounterr");
    }


}

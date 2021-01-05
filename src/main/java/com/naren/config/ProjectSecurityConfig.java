package com.naren.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {


    /*
    Securing all controllers
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
    }

    /*
    Customize security configuration
    * /myAccount - Secured
    * /myBalance - Secured
    * /myCards - Secured
    * /myLoans - Secured
    * /notices - Not Secured
    * /contact - Not Secured
    */


}

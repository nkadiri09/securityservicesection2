package com.naren.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {


    /*
    Securing all controllers
     */

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
    }*/

    /*
    Customize security configuration
    * /myAccount - Secured
    * /myBalance - Secured
    * /myCards - Secured
    * /myLoans - Secured
    * /notices - Not Secured
    * /contact - Not Secured
    */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().
                antMatchers("/myAccount").authenticated().
                antMatchers("/myBalance").authenticated().
                antMatchers("/myCards").authenticated().
                antMatchers("/myLoans").authenticated().
                antMatchers("/notices").permitAll().
                antMatchers("/contact").permitAll().
                and().formLogin().and().httpBasic();
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("12345").authorities("admin").
                and().withUser("naren").password("Test@123").authorities("read").
                and().passwordEncoder(NoOpPasswordEncoder.getInstance());
    }


}

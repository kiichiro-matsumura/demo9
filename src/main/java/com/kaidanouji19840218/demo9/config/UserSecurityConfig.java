package com.kaidanouji19840218.demo9.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@Configuration
@EnableWebSecurity
@Order(2)
public class UserSecurityConfig extends WebSecurityConfigurerAdapter {

    private ClientRegistrationRepository repo;

    public UserSecurityConfig(ClientRegistrationRepository repo) {
        this.repo = repo;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/test/user/**").permitAll()
                .anyRequest().authenticated();


        // ログアウト設定
        http.logout().logoutUrl("auth/logout").permitAll();

    }

}
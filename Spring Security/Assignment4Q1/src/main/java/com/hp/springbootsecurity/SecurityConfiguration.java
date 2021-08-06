package com.hp.springbootsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth); removing default to configure our own
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("pass")
                .roles("USER")
        //to add more users
                .and()
                .withUser("user2")
                .password("pass2")
                .roles("USER")
                .and()
                .withUser("user3")
                .password("pass3")
                .roles("ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http); replacing default
        http.authorizeRequests()
                .antMatchers("/**").hasAnyRole("USER","ADMIN")
                .and().formLogin();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}

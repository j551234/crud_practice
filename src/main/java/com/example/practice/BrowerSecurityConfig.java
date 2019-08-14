package com.example.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class BrowerSecurityConfig extends WebSecurityConfigurerAdapter {
@Override
protected void configure(HttpSecurity http) throws Exception {
http.formLogin()          // �w�q��ݭn�ϥΪ̵n�J�ɭԡA��쪺�n�J�����C
.and()
.authorizeRequests()    // �w�q����URL�ݭn�Q�O�@�B���Ǥ��ݭn�Q�O�@
.anyRequest()        // ����ШD,�n�J��i�H�X��
.authenticated();
}
@Bean
public static NoOpPasswordEncoder passwordEncoder() {
  return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
}
}
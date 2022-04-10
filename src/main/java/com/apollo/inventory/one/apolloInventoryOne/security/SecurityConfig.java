package com.apollo.inventory.one.apolloInventoryOne.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }


//   @Autowired
//   private PasswordEncoder encoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//       auth.userDetailsService(userDetailsService)
//               .passwordEncoder(passwordEncoder());
//            auth.jdbcAuthentication().dataSource(dataSource);


        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}password")
                .roles("ADMIN");
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                authorizeRequests()
//                .antMatchers("/centers","/doctors","/center","/doctor")
//                .access("hasRole('ROLE_ADMIN')")
//                .antMatchers("/patients","/patient","/rx")
//                .access("hasRole('ROLE_DOCTOR')")
//                .antMatchers("/rx")
//                .access("hasRole('ROLE_PATIENT')")
//                .antMatchers("/requests")
//                .access("hasAnyRole('ROLE_ADMIN','ROLE_DOCTOR','ROLE_PATIENT')")
//                .antMatchers("/","/**").access("permitAll")
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/requests",true)
//                .and()
//                .logout()
//                .logoutSuccessUrl("/");
//    }
}

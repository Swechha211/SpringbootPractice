package com.example.blogjpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@Configuration
@EnableWebSecurity
public class SecurityConfig  {

//    @Bean
//    public UserDetailsService userDetailsService(){

//
//    }

//    @SneakyThrows
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity)  {
////        try {
////            httpSecurity.csrf().disable()
////                    .authorizeHttpRequests()
////                    .requestMatchers("/api")
////                    .permitAll()
////                    .and()
////                    .formLogin();
////        } catch (Exception e) {
////            throw new RuntimeException(e);
////        }
//
//            httpSecurity.authorizeRequests()
//                    .antMatchers("/admin/**").hasRole("ADMIN")
//                    .antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
//                    .and()
//                    .formLogin()
//                    .and()
//                    .logout().logoutSuccessUrl("/");
//
//
//
//        return httpSecurity.build();
//
//    }


}

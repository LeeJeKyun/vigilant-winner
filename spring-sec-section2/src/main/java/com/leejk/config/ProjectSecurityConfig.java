package com.leejk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        /**
         * Below is the custom security configurations
         * 사용자 정의 보안 설정
         */

        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                .requestMatchers("/notices", "/contact").permitAll());
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();

        /**
         * Configuration to deny all the requests
         * 모든 요청을 거부하는 설정
         */

/*
        http.authorizeHttpRequests(requests -> {
            requests.anyRequest().denyAll();
        });
        http.formLogin(withDefaults());
        http.logout(withDefaults());
        return http.build();
*/

        /**
         * Configuration to permit all the requests
         * 모든 요청을 허용하는 설정
         */

/*
        http.authorizeHttpRequests(requests -> {
            requests.anyRequest().permitAll();
        });
        http.formLogin(withDefaults());
        http.logout(withDefaults());
        return http.build();
*/
    }

}

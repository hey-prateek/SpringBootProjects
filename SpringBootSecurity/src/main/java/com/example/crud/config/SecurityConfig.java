package com.example.crud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // @Bean
    // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    // http.authorizeHttpRequests(auth -> auth
    // .requestMatchers("/public/**").permitAll()
    // .requestMatchers("/admin/**").hasRole("ADMIN")
    // .anyRequest().authenticated()) // Everything else needs authentication
    // .formLogin(Customizer.withDefaults()) // Enable default form-based login
    // .csrf(csrf -> csrf.disable()); // Disable CSRF (example only - not for
    // production)

    // return http.build();
    // }

    // filter chain 1 - allowing all public apis
    @Bean
    @Order(1)
    public SecurityFilterChain publicApis(HttpSecurity http) throws Exception {
        http.securityMatcher("/api/public/**")
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)); // making
                                                                                                               // session
                                                                                                               // stateless
        return http.build();
    }

    // filter chain 2 - admin users
    @Bean
    @Order(2)
    public SecurityFilterChain adminLogin(HttpSecurity http) throws Exception {
        http.securityMatcher("/api/admin/**")
                .authorizeHttpRequests(auth -> auth.requestMatchers("/api/admin/**").hasAnyRole("ADMIN", "USER"))
                .formLogin(Customizer.withDefaults());
        return http.build();
    }

    // password encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }

    // oauth authorization
    @Bean
    public SecurityFilterChain oauthValidation(HttpSecurity http) throws Exception {
        http.oauth2ResourceServer(oauth -> oauth.jwt(Customizer.withDefaults()));
        return http.build();
    }
}

package com.dh.apigatewayservice.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {


    @Bean
    public SecurityWebFilterChain springSecurityFilterChain (ServerHttpSecurity http) {

// SI EL USUARIO ESTA AUTENTICADO PASA
        // NO VALIDAMOS ROLES NI NADA DE ESO
        http
                .authorizeExchange()
                .anyExchange()
                .authenticated()
                .and()
                // USAMOS EL LOGIN DE OAUTH 2
                .oauth2Login(); // to redirect to oauth2 login page.


        return http.build();
    }
}



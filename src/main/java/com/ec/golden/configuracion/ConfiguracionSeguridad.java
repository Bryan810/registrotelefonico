package com.ec.golden.configuracion;


import com.ec.golden.seguridad.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class ConfiguracionSeguridad extends WebSecurityConfigurerAdapter {


    @Value("${app.login.admin.username}")
    String username;
    @Value("${app.login.admin.password}")
    String password;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/Usuarios/**").permitAll()
                .antMatchers("/private/admin/**").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/private/**").authenticated()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .logout()
                .permitAll();
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth, CustomUserDetailsService userDetailsService) throws Exception {

        auth
                .userDetailsService(userDetailsService).passwordEncoder(passwordEncoder())
                .and()
                .inMemoryAuthentication()
                .withUser(username).password(password).roles("ADMIN", "EDITOR").and().passwordEncoder(passwordEncoder());

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return charSequence.toString();
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return true;
            }
        };
    }


}

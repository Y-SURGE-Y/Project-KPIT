package com.example.ats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

//@SuppressWarnings("deprecation")
@SpringBootApplication
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class Ats1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ats1Application.class, args);
	}

	
//	@Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}

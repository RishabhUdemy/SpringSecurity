package com.tradition.springsecurity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.tradition.springsecurity.service","com.tradition.springsecurity.security"})
public class RootConfig {
}

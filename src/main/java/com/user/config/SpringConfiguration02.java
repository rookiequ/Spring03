package com.user.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zzq
 */
@Configuration
@ComponentScan("com.user")
@Import(JdbcConfiguration01.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration02 {

}

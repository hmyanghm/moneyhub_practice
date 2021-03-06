package com.moneyhub2.web.ctx;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan(basePackages = {"com.moneyhub.web"})
@ComponentScan(basePackages = {"com.moneyhub.web"})
public class RootContext {
    @Bean
    public DataSource dataSource() {
/*        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/moneyhub?serverTimezone=UTC");
        hikariConfig.setUsername("moneyhub");
        hikariConfig.setPassword("moneyhub");
        
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);*/
        
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        /*
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/hmdb?serverTimezone=UTC");
        dataSource.setUsername("hmdb");
        dataSource.setPassword("hmdb");*/
        
        return dataSource;
    }
}
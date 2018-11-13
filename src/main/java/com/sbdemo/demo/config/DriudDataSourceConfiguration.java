package com.sbdemo.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author hdc
 * @Date 2018/11/12 0012 14:03
 * @Version 1.0
 * @Description
 **/
@Configuration
public class DriudDataSourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource driudDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        System.err.println("create datasource");
        return dataSource;
    }
}

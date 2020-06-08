package com.user.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 这是一个配置类，作用和bean.xml一样
 * spring新注解
 * Configuration
 *  作用：指定当前类是一个配置类
 *  细节：当前配置类作为注解对象创建参数的时候，注解可以不写ComponenScan
 *  作用：用于通过注解来指定spring在创建容器时候扫描的包
 *  属性：
 *      value:类似--base-Packages
 *      <context:component-scan base-package="com.user"></context:component-scan>
 *  Bean
 *      作用：用于把当前方法的返回值作为bean对象存入spring ioc容器中
 *      属性：name指定id
 *
 * @author zzq
 */
@Configuration
@ComponentScan("com.user")
public class SpringConfiguration01 {

/*
    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean(name = "dataSource")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.jdbc.Driver");
        ds.setPassword("123456");
        ds.setUser("root");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/springdb01?characterEncoding=UTF-8");
        return ds;
    }
*/
}

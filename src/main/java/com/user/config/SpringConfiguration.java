package com.user.config;

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
 *
 * @author zzq
 */
public class SpringConfiguration {
}

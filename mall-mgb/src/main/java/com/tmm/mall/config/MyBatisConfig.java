package com.tmm.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author： tangmingming
 * @Date: 2020-10-23 17:17
 * @Version： 1.0
 */

@Configuration
@EnableTransactionManagement
@MapperScan({"com.tmm.mall.mapper"})
public class MyBatisConfig {

}

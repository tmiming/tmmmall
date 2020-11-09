package com.tmm.mall.common.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Author： tangmingming
 * @Date: 2020-11-06 17:55
 * @Version： 1.0
 */

@Configurable
@EnableCaching
public class RedisConfig extends BaseRedisConfig{
}

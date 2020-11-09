package com.tmm.mall.common.service;

import java.util.List;
import java.util.Map;

/**
 * @Author： tangmingming
 * @Date: 2020-11-06 18:01
 * @Version： 1.0
 */

public interface RedisService {

    void set(String key, Object value, long time);

    void set(String key, Object value);

    Object get(String key);

    Boolean del(String key);

    Long del(List<String> keys);

    Boolean hSet(String key, String hashKey, Object value, long time);

    Map<Object, Object> hGetAll(String key);

    Boolean hSetAll(String key, Map<String,Object> map, long time);

    Boolean expire(String key, long time);
}

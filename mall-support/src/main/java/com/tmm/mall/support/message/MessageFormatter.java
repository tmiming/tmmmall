package com.tmm.mall.support.message;

import com.alibaba.fastjson.JSON;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 17:46
 * @Version： 1.0
 */

public class MessageFormatter {

    public static String build(String message, Object... args){
        if (args == null || args.length == 0){
            return message;
        }
        try {
            return String.format(message, args);
        }catch (Exception e){
            return message + "," + JSON.toJSONString(args);
        }
    }
}

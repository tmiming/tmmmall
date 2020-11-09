package com.tmm.mall.support.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author： tangmingming
 * @Date: 2020-10-28 16:27
 * @Version： 1.0
 */

public class IOUtil {

    public static String in2Str(InputStream in, String encoding) throws IOException {
        if (in == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader reader = new InputStreamReader(in, encoding);
            int tmp;
            char temp;
            while((tmp = reader.read()) != -1){
                temp = (char)tmp;
                sb.append(temp);
            }
        } finally {
            in.close();
        }
        return sb.toString();
    }



    public static byte[] in2Bytes(InputStream in) throws IOException{
        if (in == null){
            return null;
        }
        ByteArrayOutputStream out = null;
        byte[] bytes;
        try {
            out = new ByteArrayOutputStream();
            byte[] buffer = new byte[2048];
            int len;
            while((len = in.read()) > 0){
                out.write(buffer, 0, len);
            }
            bytes = out.toByteArray();
        }finally {
            if (out != null){
                out.close();
            }
            in.close();
        }
        return bytes;
    }

}

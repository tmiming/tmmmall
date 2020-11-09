package com.tmm.mall.support.convertor;

import com.google.common.collect.Lists;
import com.tmm.mall.support.exception.ServiceException;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 17:42
 * @Version： 1.0
 */

public abstract class AbstractConvertor<T, P> {

    private Class<?> clazz;

    protected abstract T copy(P entity);

    public T convert(P entity){
        if (entity != null){
            try {
                return copy(entity);
            }catch (Exception e){
                throw new ServiceException(e, "convert %s to %s failed, [message=%s]", entity.getClass(), clazz, e.getMessage());
            }
        }
        return null;
    }

    public List<T> convert(List<P> entities){
        if(CollectionUtils.isNotEmpty(entities)){
            List<T> list = new ArrayList<>();
            entities.forEach(p -> {
                list.add(copy(p));
            });
            return list;
        }
        return Lists.newArrayList();
    }

    public List<T> convert(P[] entities){
        return convert(Lists.newArrayList(entities));
    }

}

package cn.share2u.ssmTest.dao;

import org.apache.ibatis.annotations.Param;

public interface BaseDao<T> {
    T select(T t);
}

package cn.share2u.ssmTest.dao;

public interface BaseDao<T> {
    T select(Integer id);
}

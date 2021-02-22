package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogInfoSort;
public interface BlogInfoSortService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogInfoSort record);

    int insertSelective(BlogInfoSort record);

    BlogInfoSort selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogInfoSort record);

    int updateByPrimaryKey(BlogInfoSort record);

}

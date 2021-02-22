package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogTag;
public interface BlogTagService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogTag record);

    int insertSelective(BlogTag record);

    BlogTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogTag record);

    int updateByPrimaryKey(BlogTag record);

}

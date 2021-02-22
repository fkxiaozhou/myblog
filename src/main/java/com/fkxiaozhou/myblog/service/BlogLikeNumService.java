package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogLikeNum;
public interface BlogLikeNumService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogLikeNum record);

    int insertSelective(BlogLikeNum record);

    BlogLikeNum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogLikeNum record);

    int updateByPrimaryKey(BlogLikeNum record);

}

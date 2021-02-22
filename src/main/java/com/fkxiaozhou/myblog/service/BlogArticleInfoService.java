package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogArticleInfo;
public interface BlogArticleInfoService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogArticleInfo record);

    int insertSelective(BlogArticleInfo record);

    BlogArticleInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogArticleInfo record);

    int updateByPrimaryKey(BlogArticleInfo record);

}

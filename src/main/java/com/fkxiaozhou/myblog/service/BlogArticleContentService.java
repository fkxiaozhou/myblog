package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogArticleContent;
public interface BlogArticleContentService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogArticleContent record);

    int insertSelective(BlogArticleContent record);

    BlogArticleContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogArticleContent record);

    int updateByPrimaryKey(BlogArticleContent record);

}

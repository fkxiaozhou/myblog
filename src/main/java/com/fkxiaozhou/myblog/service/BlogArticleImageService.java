package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogArticleImage;
public interface BlogArticleImageService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogArticleImage record);

    int insertSelective(BlogArticleImage record);

    BlogArticleImage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogArticleImage record);

    int updateByPrimaryKey(BlogArticleImage record);

}

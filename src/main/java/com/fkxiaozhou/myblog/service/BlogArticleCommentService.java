package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogArticleComment;
public interface BlogArticleCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogArticleComment record);

    int insertSelective(BlogArticleComment record);

    BlogArticleComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogArticleComment record);

    int updateByPrimaryKey(BlogArticleComment record);

}

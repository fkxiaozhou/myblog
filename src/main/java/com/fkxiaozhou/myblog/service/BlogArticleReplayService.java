package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogArticleReplay;
public interface BlogArticleReplayService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogArticleReplay record);

    int insertSelective(BlogArticleReplay record);

    BlogArticleReplay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogArticleReplay record);

    int updateByPrimaryKey(BlogArticleReplay record);

}

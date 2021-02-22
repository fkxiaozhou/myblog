package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogUserLike;
public interface BlogUserLikeService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogUserLike record);

    int insertSelective(BlogUserLike record);

    BlogUserLike selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogUserLike record);

    int updateByPrimaryKey(BlogUserLike record);

}

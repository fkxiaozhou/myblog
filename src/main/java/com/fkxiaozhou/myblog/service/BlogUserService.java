package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogUser;
public interface BlogUserService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogUser record);

    int insertSelective(BlogUser record);

    BlogUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogUser record);

    int updateByPrimaryKey(BlogUser record);

}

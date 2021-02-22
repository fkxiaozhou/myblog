package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogUserView;
public interface BlogUserViewService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogUserView record);

    int insertSelective(BlogUserView record);

    BlogUserView selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogUserView record);

    int updateByPrimaryKey(BlogUserView record);

}

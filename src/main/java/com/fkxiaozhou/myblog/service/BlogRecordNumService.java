package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogRecordNum;
public interface BlogRecordNumService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogRecordNum record);

    int insertSelective(BlogRecordNum record);

    BlogRecordNum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogRecordNum record);

    int updateByPrimaryKey(BlogRecordNum record);

}

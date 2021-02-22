package com.fkxiaozhou.myblog.service;

import com.fkxiaozhou.myblog.entity.BlogRecordView;
public interface BlogRecordViewService{


    int deleteByPrimaryKey(Long id);

    int insert(BlogRecordView record);

    int insertSelective(BlogRecordView record);

    BlogRecordView selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogRecordView record);

    int updateByPrimaryKey(BlogRecordView record);

}

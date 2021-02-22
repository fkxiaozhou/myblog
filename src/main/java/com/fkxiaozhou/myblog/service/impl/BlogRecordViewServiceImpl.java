package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogRecordView;
import com.fkxiaozhou.myblog.mapper.BlogRecordViewMapper;
import com.fkxiaozhou.myblog.service.BlogRecordViewService;
@Service
public class BlogRecordViewServiceImpl implements BlogRecordViewService{

    @Resource
    private BlogRecordViewMapper blogRecordViewMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogRecordViewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogRecordView record) {
        return blogRecordViewMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogRecordView record) {
        return blogRecordViewMapper.insertSelective(record);
    }

    @Override
    public BlogRecordView selectByPrimaryKey(Long id) {
        return blogRecordViewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogRecordView record) {
        return blogRecordViewMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogRecordView record) {
        return blogRecordViewMapper.updateByPrimaryKey(record);
    }

}

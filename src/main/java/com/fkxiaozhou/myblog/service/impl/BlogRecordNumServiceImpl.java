package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogRecordNum;
import com.fkxiaozhou.myblog.mapper.BlogRecordNumMapper;
import com.fkxiaozhou.myblog.service.BlogRecordNumService;
@Service
public class BlogRecordNumServiceImpl implements BlogRecordNumService{

    @Resource
    private BlogRecordNumMapper blogRecordNumMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogRecordNumMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogRecordNum record) {
        return blogRecordNumMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogRecordNum record) {
        return blogRecordNumMapper.insertSelective(record);
    }

    @Override
    public BlogRecordNum selectByPrimaryKey(Long id) {
        return blogRecordNumMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogRecordNum record) {
        return blogRecordNumMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogRecordNum record) {
        return blogRecordNumMapper.updateByPrimaryKey(record);
    }

}

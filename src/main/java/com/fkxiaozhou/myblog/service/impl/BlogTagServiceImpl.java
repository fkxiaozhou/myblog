package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogTag;
import com.fkxiaozhou.myblog.mapper.BlogTagMapper;
import com.fkxiaozhou.myblog.service.BlogTagService;
@Service
public class BlogTagServiceImpl implements BlogTagService{

    @Resource
    private BlogTagMapper blogTagMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogTagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogTag record) {
        return blogTagMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogTag record) {
        return blogTagMapper.insertSelective(record);
    }

    @Override
    public BlogTag selectByPrimaryKey(Long id) {
        return blogTagMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogTag record) {
        return blogTagMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogTag record) {
        return blogTagMapper.updateByPrimaryKey(record);
    }

}

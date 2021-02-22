package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogInfoSort;
import com.fkxiaozhou.myblog.mapper.BlogInfoSortMapper;
import com.fkxiaozhou.myblog.service.BlogInfoSortService;
@Service
public class BlogInfoSortServiceImpl implements BlogInfoSortService{

    @Resource
    private BlogInfoSortMapper blogInfoSortMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogInfoSortMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogInfoSort record) {
        return blogInfoSortMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogInfoSort record) {
        return blogInfoSortMapper.insertSelective(record);
    }

    @Override
    public BlogInfoSort selectByPrimaryKey(Long id) {
        return blogInfoSortMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogInfoSort record) {
        return blogInfoSortMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogInfoSort record) {
        return blogInfoSortMapper.updateByPrimaryKey(record);
    }

}

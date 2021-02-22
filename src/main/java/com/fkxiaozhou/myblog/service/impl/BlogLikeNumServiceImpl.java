package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogLikeNum;
import com.fkxiaozhou.myblog.mapper.BlogLikeNumMapper;
import com.fkxiaozhou.myblog.service.BlogLikeNumService;
@Service
public class BlogLikeNumServiceImpl implements BlogLikeNumService{

    @Resource
    private BlogLikeNumMapper blogLikeNumMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogLikeNumMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogLikeNum record) {
        return blogLikeNumMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogLikeNum record) {
        return blogLikeNumMapper.insertSelective(record);
    }

    @Override
    public BlogLikeNum selectByPrimaryKey(Long id) {
        return blogLikeNumMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogLikeNum record) {
        return blogLikeNumMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogLikeNum record) {
        return blogLikeNumMapper.updateByPrimaryKey(record);
    }

}

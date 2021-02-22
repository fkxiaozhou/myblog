package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogArticleReplay;
import com.fkxiaozhou.myblog.mapper.BlogArticleReplayMapper;
import com.fkxiaozhou.myblog.service.BlogArticleReplayService;
@Service
public class BlogArticleReplayServiceImpl implements BlogArticleReplayService{

    @Resource
    private BlogArticleReplayMapper blogArticleReplayMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogArticleReplayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogArticleReplay record) {
        return blogArticleReplayMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogArticleReplay record) {
        return blogArticleReplayMapper.insertSelective(record);
    }

    @Override
    public BlogArticleReplay selectByPrimaryKey(Long id) {
        return blogArticleReplayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogArticleReplay record) {
        return blogArticleReplayMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogArticleReplay record) {
        return blogArticleReplayMapper.updateByPrimaryKey(record);
    }

}

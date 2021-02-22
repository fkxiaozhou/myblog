package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogArticleContent;
import com.fkxiaozhou.myblog.mapper.BlogArticleContentMapper;
import com.fkxiaozhou.myblog.service.BlogArticleContentService;
@Service
public class BlogArticleContentServiceImpl implements BlogArticleContentService{

    @Resource
    private BlogArticleContentMapper blogArticleContentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogArticleContentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogArticleContent record) {
        return blogArticleContentMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogArticleContent record) {
        return blogArticleContentMapper.insertSelective(record);
    }

    @Override
    public BlogArticleContent selectByPrimaryKey(Long id) {
        return blogArticleContentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogArticleContent record) {
        return blogArticleContentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogArticleContent record) {
        return blogArticleContentMapper.updateByPrimaryKey(record);
    }

}

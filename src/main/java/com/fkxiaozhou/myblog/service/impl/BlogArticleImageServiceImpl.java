package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogArticleImage;
import com.fkxiaozhou.myblog.mapper.BlogArticleImageMapper;
import com.fkxiaozhou.myblog.service.BlogArticleImageService;
@Service
public class BlogArticleImageServiceImpl implements BlogArticleImageService{

    @Resource
    private BlogArticleImageMapper blogArticleImageMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogArticleImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogArticleImage record) {
        return blogArticleImageMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogArticleImage record) {
        return blogArticleImageMapper.insertSelective(record);
    }

    @Override
    public BlogArticleImage selectByPrimaryKey(Long id) {
        return blogArticleImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogArticleImage record) {
        return blogArticleImageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogArticleImage record) {
        return blogArticleImageMapper.updateByPrimaryKey(record);
    }

}

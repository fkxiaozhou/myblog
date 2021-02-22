package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.mapper.BlogArticleInfoMapper;
import com.fkxiaozhou.myblog.entity.BlogArticleInfo;
import com.fkxiaozhou.myblog.service.BlogArticleInfoService;
@Service
public class BlogArticleInfoServiceImpl implements BlogArticleInfoService{

    @Resource
    private BlogArticleInfoMapper blogArticleInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogArticleInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogArticleInfo record) {
        return blogArticleInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogArticleInfo record) {
        return blogArticleInfoMapper.insertSelective(record);
    }

    @Override
    public BlogArticleInfo selectByPrimaryKey(Long id) {
        return blogArticleInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogArticleInfo record) {
        return blogArticleInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogArticleInfo record) {
        return blogArticleInfoMapper.updateByPrimaryKey(record);
    }

}

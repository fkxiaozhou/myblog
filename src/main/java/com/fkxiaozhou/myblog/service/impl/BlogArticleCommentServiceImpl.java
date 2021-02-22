package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogArticleComment;
import com.fkxiaozhou.myblog.mapper.BlogArticleCommentMapper;
import com.fkxiaozhou.myblog.service.BlogArticleCommentService;
@Service
public class BlogArticleCommentServiceImpl implements BlogArticleCommentService{

    @Resource
    private BlogArticleCommentMapper blogArticleCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogArticleCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogArticleComment record) {
        return blogArticleCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogArticleComment record) {
        return blogArticleCommentMapper.insertSelective(record);
    }

    @Override
    public BlogArticleComment selectByPrimaryKey(Long id) {
        return blogArticleCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogArticleComment record) {
        return blogArticleCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogArticleComment record) {
        return blogArticleCommentMapper.updateByPrimaryKey(record);
    }

}

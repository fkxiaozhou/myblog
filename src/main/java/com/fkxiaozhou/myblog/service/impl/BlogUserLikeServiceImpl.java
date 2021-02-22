package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogUserLike;
import com.fkxiaozhou.myblog.mapper.BlogUserLikeMapper;
import com.fkxiaozhou.myblog.service.BlogUserLikeService;
@Service
public class BlogUserLikeServiceImpl implements BlogUserLikeService{

    @Resource
    private BlogUserLikeMapper blogUserLikeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogUserLikeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogUserLike record) {
        return blogUserLikeMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogUserLike record) {
        return blogUserLikeMapper.insertSelective(record);
    }

    @Override
    public BlogUserLike selectByPrimaryKey(Long id) {
        return blogUserLikeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogUserLike record) {
        return blogUserLikeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogUserLike record) {
        return blogUserLikeMapper.updateByPrimaryKey(record);
    }

}

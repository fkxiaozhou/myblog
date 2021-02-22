package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.entity.BlogUserView;
import com.fkxiaozhou.myblog.mapper.BlogUserViewMapper;
import com.fkxiaozhou.myblog.service.BlogUserViewService;
@Service
public class BlogUserViewServiceImpl implements BlogUserViewService{

    @Resource
    private BlogUserViewMapper blogUserViewMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogUserViewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogUserView record) {
        return blogUserViewMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogUserView record) {
        return blogUserViewMapper.insertSelective(record);
    }

    @Override
    public BlogUserView selectByPrimaryKey(Long id) {
        return blogUserViewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogUserView record) {
        return blogUserViewMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogUserView record) {
        return blogUserViewMapper.updateByPrimaryKey(record);
    }

}

package com.fkxiaozhou.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.myblog.mapper.BlogUserMapper;
import com.fkxiaozhou.myblog.entity.BlogUser;
import com.fkxiaozhou.myblog.service.BlogUserService;
@Service
public class BlogUserServiceImpl implements BlogUserService{

    @Resource
    private BlogUserMapper blogUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BlogUser record) {
        return blogUserMapper.insert(record);
    }

    @Override
    public int insertSelective(BlogUser record) {
        return blogUserMapper.insertSelective(record);
    }

    @Override
    public BlogUser selectByPrimaryKey(Long id) {
        return blogUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlogUser record) {
        return blogUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BlogUser record) {
        return blogUserMapper.updateByPrimaryKey(record);
    }

}

package com.fkxiaozhou.myblog.mapper;

import com.fkxiaozhou.myblog.entity.BlogTag;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogTagMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(BlogTag record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BlogTag record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    BlogTag selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BlogTag record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BlogTag record);
}
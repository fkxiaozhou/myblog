package com.fkxiaozhou.myblog.mapper;

import com.fkxiaozhou.myblog.entity.BlogInfoSort;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogInfoSortMapper {
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
    int insert(BlogInfoSort record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BlogInfoSort record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    BlogInfoSort selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BlogInfoSort record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BlogInfoSort record);
}
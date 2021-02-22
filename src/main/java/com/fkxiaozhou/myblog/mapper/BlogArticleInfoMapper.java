package com.fkxiaozhou.myblog.mapper;

import com.fkxiaozhou.myblog.entity.BlogArticleInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogArticleInfoMapper {
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
    int insert(BlogArticleInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BlogArticleInfo record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    BlogArticleInfo selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BlogArticleInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BlogArticleInfo record);
}
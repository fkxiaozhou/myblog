package com.fkxiaozhou.myblog.mapper;

import com.fkxiaozhou.myblog.entity.BlogArticleComment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogArticleCommentMapper {
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
    int insert(BlogArticleComment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BlogArticleComment record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    BlogArticleComment selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BlogArticleComment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BlogArticleComment record);
}
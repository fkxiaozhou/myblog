package com.fkxiaozhou.myblog.mapper;

import com.fkxiaozhou.myblog.entity.BlogRecordNum;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogRecordNumMapper {
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
    int insert(BlogRecordNum record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BlogRecordNum record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    BlogRecordNum selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BlogRecordNum record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BlogRecordNum record);
}
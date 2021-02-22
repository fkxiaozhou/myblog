package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogRecordNum")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogRecordNum implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 博客数
    */
    @ApiModelProperty(value="博客数")
    private Integer data;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date createBy;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String username;

    private static final long serialVersionUID = 1L;
}
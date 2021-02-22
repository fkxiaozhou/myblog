package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 这张表用来保存题图url，每一篇文章都应该有题图
    */
@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogArticleImage")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogArticleImage implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 对应文章id
    */
    @ApiModelProperty(value="对应文章id")
    private Long articleId;

    /**
    * 图片url
    */
    @ApiModelProperty(value="图片url")
    private String imageUrl;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createBy;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date modifiedBy;

    private static final long serialVersionUID = 1L;
}
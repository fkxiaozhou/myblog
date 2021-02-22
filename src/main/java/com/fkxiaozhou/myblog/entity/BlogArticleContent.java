package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogArticleContent")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogArticleContent implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 文章内容
    */
    @ApiModelProperty(value="文章内容")
    private String articleContent;

    /**
    * 文章id,对应info的id
    */
    @ApiModelProperty(value="文章id,对应info的id")
    private Long articleId;

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
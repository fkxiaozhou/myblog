package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogArticleInfo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogArticleInfo implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 作者
    */
    @ApiModelProperty(value="作者")
    private String author;

    /**
    * 文章标题
    */
    @ApiModelProperty(value="文章标题")
    private String articleTitle;

    /**
    * 访问量
    */
    @ApiModelProperty(value="访问量")
    private Integer articleViews;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createBy;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date modifiedBy;

    /**
    * 是否删除，默认为0，1为是
    */
    @ApiModelProperty(value="是否删除，默认为0，1为是")
    private Boolean isDelete;

    /**
    * 点赞数量
    */
    @ApiModelProperty(value="点赞数量")
    private Integer likeNum;

    private static final long serialVersionUID = 1L;
}
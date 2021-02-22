package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogInfoSort")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogInfoSort implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 分类id
    */
    @ApiModelProperty(value="分类id")
    private Long sortId;

    /**
    * 文章id
    */
    @ApiModelProperty(value="文章id")
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

    /**
    * 是否有效
    */
    @ApiModelProperty(value="是否有效")
    private Boolean isEffective;

    private static final long serialVersionUID = 1L;
}
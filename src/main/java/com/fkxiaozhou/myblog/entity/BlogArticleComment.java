package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogArticleComment")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogArticleComment implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long articleId;

    /**
    * 评论名
    */
    @ApiModelProperty(value="评论名")
    private String commentName;

    @ApiModelProperty(value="")
    private String comment;

    @ApiModelProperty(value="")
    private Date createBy;

    @ApiModelProperty(value="")
    private Date modifiedBy;

    /**
    * 是否删除，默认为0，1为是
    */
    @ApiModelProperty(value="是否删除，默认为0，1为是")
    private Boolean isDelete;

    /**
    * 回复名
    */
    @ApiModelProperty(value="回复名")
    private String replyName;

    /**
    * 父评论ID
    */
    @ApiModelProperty(value="父评论ID")
    private Long parentId;

    private static final long serialVersionUID = 1L;
}
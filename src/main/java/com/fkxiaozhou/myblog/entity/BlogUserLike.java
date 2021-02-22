package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogUserLike")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogUserLike implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String userName;

    /**
    * 被点赞的文章id
    */
    @ApiModelProperty(value="被点赞的文章id")
    private Long articleId;

    /**
    * 用户是否点赞，默认为0，0未点赞，1点赞
    */
    @ApiModelProperty(value="用户是否点赞，默认为0，0未点赞，1点赞")
    private Boolean likeStatus;

    private static final long serialVersionUID = 1L;
}
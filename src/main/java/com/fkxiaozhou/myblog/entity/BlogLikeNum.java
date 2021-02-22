package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogLikeNum")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogLikeNum implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 每日的访问量
    */
    @ApiModelProperty(value="每日的访问量")
    private Integer views;

    @ApiModelProperty(value="")
    private Date createBy;

    private static final long serialVersionUID = 1L;
}
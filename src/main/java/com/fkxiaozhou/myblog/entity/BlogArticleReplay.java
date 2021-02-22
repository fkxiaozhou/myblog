package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogArticleReplay")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogArticleReplay implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long commentId;

    @ApiModelProperty(value="")
    private String replay;

    @ApiModelProperty(value="")
    private Date createBy;

    @ApiModelProperty(value="")
    private Date modifiedBy;

    @ApiModelProperty(value="")
    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}
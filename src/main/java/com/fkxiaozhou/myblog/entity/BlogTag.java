package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogTag")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogTag implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 分类名称
    */
    @ApiModelProperty(value="分类名称")
    private String tagName;

    /**
    * 数量
    */
    @ApiModelProperty(value="数量")
    private Byte tagNumber;

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
    * 是否有效，默认1有效，0无效
    */
    @ApiModelProperty(value="是否有效，默认1有效，0无效")
    private Boolean isEffective;

    private static final long serialVersionUID = 1L;
}
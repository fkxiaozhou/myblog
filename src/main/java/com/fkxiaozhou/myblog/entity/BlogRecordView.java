package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogRecordView")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogRecordView implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 每日的访问量
    */
    @ApiModelProperty(value="每日的访问量")
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
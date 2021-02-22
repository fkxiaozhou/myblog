package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogUserView")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogUserView implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String userName;

    @ApiModelProperty(value="")
    private Long view;

    private static final long serialVersionUID = 1L;
}
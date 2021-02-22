package com.fkxiaozhou.myblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-fkxiaozhou-myblog-entity-BlogUser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogUser implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 登录名
    */
    @ApiModelProperty(value="登录名")
    private String email;

    /**
    * 登录密码
    */
    @ApiModelProperty(value="登录密码")
    private String password;

    /**
    * 昵称
    */
    @ApiModelProperty(value="昵称")
    private String username;

    /**
    * 角色
    */
    @ApiModelProperty(value="角色")
    private String role;

    /**
    * 是否激活，默认为0
    */
    @ApiModelProperty(value="是否激活，默认为0")
    private Boolean status;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createBy;

    private static final long serialVersionUID = 1L;
}
package com.max.angel.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CommonEntity implements Serializable {

    /* 删除标志 */
    @ApiModelProperty(value = "删除标志", position = 1000)
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private String deleteFlag;

    /* 创建人 */
    @ApiModelProperty(value = "创建人", position = 1002)
    @TableField(fill = FieldFill.INSERT)
    private String createUser;

    /* 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 1001)
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /* 更新人 */
    @ApiModelProperty(value = "更新人", position = 1004)
    @TableField(fill = FieldFill.UPDATE)
    private String updateUser;

    /* 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 1003)
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
}

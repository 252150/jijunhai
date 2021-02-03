package com.shopping.product.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TJob implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("jobName")
    private String jobName;

    private String description;

    private String cron;

    /**
     * springBean名
     */
    @TableField("springBeanName")
    private String springBeanName;

    /**
     * 方法名
     */
    @TableField("methodName")
    private String methodName;

    /**
     * 是否是系统job
     */
    @TableField("isSysJob")
    private Boolean isSysJob;

    private Boolean status;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("updateTime")
    private LocalDateTime updateTime;


}

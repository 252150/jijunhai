package com.shopping.product.domain;

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
public class TToken implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * token
     */
    private String id;

    /**
     * LoginUser的json串
     */
    private String val;

    @TableField("expireTime")
    private LocalDateTime expireTime;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("updateTime")
    private LocalDateTime updateTime;


}

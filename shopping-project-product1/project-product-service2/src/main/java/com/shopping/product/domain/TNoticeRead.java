package com.shopping.product.domain;

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
public class TNoticeRead implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("noticeId")
    private Integer noticeId;

    @TableField("userId")
    private Integer userId;

    @TableField("createTime")
    private LocalDateTime createTime;


}

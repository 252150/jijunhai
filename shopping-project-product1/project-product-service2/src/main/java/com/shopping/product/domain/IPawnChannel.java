package com.shopping.product.domain;

import java.math.BigDecimal;
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
public class IPawnChannel implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("CHANNEL_CODE")
    private String channelCode;

    @TableField("CHANNEL_NAME")
    private String channelName;

    @TableField("MOBILE")
    private String mobile;

    @TableField("ID_NO")
    private String idNo;

    @TableField("ACCOUNT_NAME")
    private String accountName;

    @TableField("BANK_NAME")
    private String bankName;

    @TableField("ACCOUNT")
    private String account;

    @TableField("MEMBER_COUNT")
    private Integer memberCount;

    @TableField("TOTAL_CHARGE")
    private BigDecimal totalCharge;

    @TableField("CONSUME")
    private BigDecimal consume;

    /**
     * ʹ
     */
    @TableField("CHANNEL_STAT")
    private Integer channelStat;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("MODIFY_BY")
    private String modifyBy;

    @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;


}

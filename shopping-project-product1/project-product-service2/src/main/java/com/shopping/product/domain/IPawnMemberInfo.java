package com.shopping.product.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
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
public class IPawnMemberInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("MEMBER_ID")
    private Integer memberId;

    @TableField("MEMBER_NAME")
    private String memberName;

    @TableField("MOBILE")
    private String mobile;

    @TableField("CERT_NO")
    private String certNo;

    @TableField("ACCOUNT_NAME")
    private String accountName;

    @TableField("BANK_NAME")
    private String bankName;

    @TableField("ACCOUNT")
    private String account;

    @TableField("BIRTHDAY")
    private LocalDate birthday;

    @TableField("LEVEL")
    private String level;

    @TableField("BALANCE")
    private BigDecimal balance;

    @TableField("BLOCKED_BALANCES")
    private BigDecimal blockedBalances;

    @TableField("CREDIT")
    private BigDecimal credit;

    /**
     * 0
     */
    @TableField("CREDIT_ENABLED")
    private String creditEnabled;

    @TableField("AVAILABLE_POINT")
    private Integer availablePoint;

    @TableField("TOTAL_POINT")
    private Integer totalPoint;

    @TableField("JOIN_DATE")
    private LocalDate joinDate;

    @TableField("CHANNEL_CODE")
    private String channelCode;

    /**
     * ʹ
     */
    @TableField("MEMBER_STAT")
    private byte[] memberStat;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("MODIFY_BY")
    private String modifyBy;

    @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;


}

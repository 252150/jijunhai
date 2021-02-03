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
public class IPawnGoodsAppraiseLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("APPRAISE_ID")
    private Integer appraiseId;

    @TableField("GOODS_ID")
    private Integer goodsId;

    @TableField("PROC_INST_ID")
    private String procInstId;

    @TableField("OFFICIAL_PRICE")
    private BigDecimal officialPrice;

    @TableField("VALUATION_PRICE")
    private BigDecimal valuationPrice;

    @TableField("PAWN_PRICE")
    private BigDecimal pawnPrice;

    @TableField("RCHASE_PRICE")
    private BigDecimal rchasePrice;

    @TableField("SELLING_PRICE")
    private BigDecimal sellingPrice;

    @TableField("RENTAL_PRICE")
    private BigDecimal rentalPrice;

    @TableField("APPRAISE_DESC")
    private String appraiseDesc;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("MODIFY_BY")
    private String modifyBy;

    @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;


}

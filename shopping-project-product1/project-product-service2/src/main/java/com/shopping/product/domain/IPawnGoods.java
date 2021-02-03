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
public class IPawnGoods implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("GOODS_ID")
    private Integer goodsId;

    @TableField("SOURCE_GOODS_ID")
    private Integer sourceGoodsId;

    @TableField("PROC_INST_ID")
    private String procInstId;

    @TableField("BRAND_CODE")
    private String brandCode;

    @TableField("CAT_CODE")
    private String catCode;

    @TableField("SUB_CAT_CODE")
    private String subCatCode;

    @TableField("DETAIL_CAT_CODE")
    private String detailCatCode;

    @TableField("GOODS_NAME")
    private String goodsName;

    @TableField("SHOP_CODE")
    private String shopCode;

    @TableField("WH_CODE")
    private String whCode;

    @TableField("ARTICLE_NUMBER")
    private String articleNumber;

    @TableField("FIRST_PRICE")
    private BigDecimal firstPrice;

    @TableField("OFFICIAL_PRICE")
    private BigDecimal officialPrice;

    @TableField("VALUATION_PRICE")
    private BigDecimal valuationPrice;

    @TableField("PAWN_PRICE")
    private BigDecimal pawnPrice;

    @TableField("PURCHASE_PRICE")
    private BigDecimal purchasePrice;

    @TableField("SELLING_PRICE")
    private BigDecimal sellingPrice;

    @TableField("RENT_PRICE")
    private BigDecimal rentPrice;

    @TableField("BOTTOM_PRICE")
    private BigDecimal bottomPrice;

    @TableField("GOODS_DESC")
    private String goodsDesc;

    @TableField("INPUT_USER")
    private byte[] inputUser;

    @TableField("INPUT_DATE")
    private LocalDate inputDate;

    @TableField("SURVEYOR")
    private String surveyor;

    @TableField("SURVEY_TIME")
    private LocalDateTime surveyTime;

    @TableField("ASSESSOR")
    private String assessor;

    @TableField("ASSESS_TIME")
    private LocalDateTime assessTime;

    /**
     * 0
     */
    @TableField("IS_RENTABLE")
    private String isRentable;

    /**
     * 0
     */
    @TableField("IS_SALABLE")
    private String isSalable;

    /**
     * ֵ
     */
    @TableField("SOURCE_TYPE")
    private String sourceType;

    /**
     * 0
     */
    @TableField("IS_IN_PROC")
    private String isInProc;

    /**
     * ֵ
     */
    @TableField("STOCK_STAT")
    private String stockStat;

    /**
     * ֵ
     */
    @TableField("GOODS_STAT")
    private String goodsStat;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("MODIFY_BY")
    private String modifyBy;

    @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;


}

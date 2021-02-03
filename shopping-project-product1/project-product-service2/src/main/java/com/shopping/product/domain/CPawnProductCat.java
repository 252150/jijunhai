package com.shopping.product.domain;

import com.baomidou.mybatisplus.annotation.TableId;
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
public class CPawnProductCat implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("CAT_CODE")
    private String catCode;

    @TableField("CAT_NAME")
    private String catName;

    @TableField("P_CAT_CODE")
    private String pCatCode;

    @TableField("CAT_LVL")
    private Integer catLvl;

    @TableField("CAT_ROUTE")
    private String catRoute;

    @TableField("UNIT")
    private String unit;

    @TableField("CAT_DESC")
    private String catDesc;

    /**
     * ͨ
     */
    @TableField("EVAL_PIC_DEF")
    private String evalPicDef;

    /**
     * ȡ
     */
    @TableField("IS_SHOW")
    private String isShow;

    @TableField("SORT_NO")
    private String sortNo;


}

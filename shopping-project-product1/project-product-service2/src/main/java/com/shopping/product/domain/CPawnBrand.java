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
public class CPawnBrand implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("BRAND_CODE")
    private String brandCode;

    @TableField("BRAND_NAME")
    private String brandName;

    @TableField("F_LETTER")
    private String fLetter;

    @TableField("BRAND_DESC")
    private String brandDesc;

    /**
     * ȡ
     */
    @TableField("IS_SHOW")
    private String isShow;

    @TableField("SORT_NO")
    private String sortNo;


}

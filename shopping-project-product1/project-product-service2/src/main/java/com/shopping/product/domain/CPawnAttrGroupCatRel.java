package com.shopping.product.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * Ʒ
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CPawnAttrGroupCatRel implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("GROUP_CODE")
    private String groupCode;

    @TableField("CAT_CODE")
    private String catCode;


}

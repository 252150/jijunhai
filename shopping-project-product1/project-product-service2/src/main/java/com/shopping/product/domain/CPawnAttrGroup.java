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
public class CPawnAttrGroup implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("GROUP_CODE")
    private String groupCode;

    @TableField("GROUP_NAME")
    private String groupName;

    /**
     * ʹ
     */
    @TableField("GROUP_STAT")
    private String groupStat;

    @TableField("SORT_NO")
    private String sortNo;

    @TableField("GROUP_COUNT")
    private Integer groupCount;


}

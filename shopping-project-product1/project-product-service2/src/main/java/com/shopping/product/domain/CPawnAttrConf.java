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
public class CPawnAttrConf implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("ATTR_CODE")
    private String attrCode;

    @TableField("GROUP_CODE")
    private String groupCode;

    @TableField("ATTR_NAME")
    private String attrName;

    /**
     * ȡ
     */
    @TableField("ATTR_TYPE")
    private String attrType;

    @TableField("OPTIONS")
    private String options;

    @TableField("SORT_NO")
    private String sortNo;


}

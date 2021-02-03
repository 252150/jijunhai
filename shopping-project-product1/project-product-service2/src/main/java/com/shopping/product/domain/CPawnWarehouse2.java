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
public class CPawnWarehouse2 implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("WH_CODE")
    private String whCode;

    @TableField("WH_NAME")
    private String whName;

    @TableField("CONTACT")
    private String contact;

    @TableField("PHONE_NO")
    private String phoneNo;

    @TableField("ADDRESS")
    private String address;

    /**
     * ʹ
     */
    @TableField("WH_STAT")
    private String whStat;


}

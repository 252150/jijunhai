package com.shopping.product.domain;

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
public class IPawnGoodsIdentifyLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("IDENTIFY_ID")
    private Integer identifyId;

    @TableField("GOODS_ID")
    private Integer goodsId;

    @TableField("PROC_INST_ID")
    private String procInstId;

    @TableField("GOODS_QUALITY")
    private String goodsQuality;

    @TableField("IDENTIFY_DESC")
    private String identifyDesc;

    @TableField("IDENTIFY_RESULT")
    private String identifyResult;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("MODIFY_BY")
    private String modifyBy;

    @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;


}

package com.shopping.product.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品扩展
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TProductExt implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 简介
     */
    private String description;

    /**
     * 图文内容
     */
    @TableField("richContent")
    private String richContent;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 显示属性
     */
    @TableField("viewProperties")
    private String viewProperties;

    @TableField("skuProperties")
    private String skuProperties;


}

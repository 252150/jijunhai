package com.shopping.product.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品目录
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TProductType implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private Long createTime;

    @TableField("updateTime")
    private Long updateTime;

    /**
     * 类型名
     */
    private String name;

    /**
     * 父ID
     */
    private Long pid;

    /**
     * 图标
     */
    private String logo;

    /**
     * 描述
     */
    private String description;

    @TableField("sortIndex")
    private Integer sortIndex;

    /**
     * 路径
     */
    private String path;

    /**
     * 商品数量
     */
    @TableField("totalCount")
    private Integer totalCount;

    /**
     * 分类标题（SEO）
     */
    @TableField("seoTitle")
    private String seoTitle;

    /**
     * 分类关键字（SEO）
     */
    @TableField("seoKeywords")
    private String seoKeywords;

    private List<TProductType> productType;




}

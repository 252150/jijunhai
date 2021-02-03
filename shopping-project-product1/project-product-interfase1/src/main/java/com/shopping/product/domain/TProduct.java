package com.shopping.product.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Document(indexName = "product",type = "product")
public class TProduct implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private Long createTime;

    @TableField("updateTime")
    private Long updateTime;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 副名称
     */
    @TableField("subName")
    private String subName;

    /**
     * 商品编码
     */
    private String code;

    /**
     * 商品类型ID
     */
    private Long productTypeId;

    /**
     * 上架时间
     */
    @TableField("onSaleTime")
    private Long onSaleTime;

    /**
     * 下架时间
     */
    @TableField("offSaleTime")
    private Long offSaleTime;

    private Long brandId;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 最高价
     */
    @TableField("maxPrice")
    private Integer maxPrice;

    /**
     * 最低价
     */
    @TableField("minPrice")
    private Integer minPrice;

    /**
     * 销量
     */
    @TableField("saleCount")
    private Integer saleCount;

    /**
     * 浏览量
     */
    @TableField("viewCount")
    private Integer viewCount;

    /**
     * 评论数
     */
    @TableField("commentCount")
    private Integer commentCount;

    /**
     * 评分
     */
    @TableField("commentScore")
    private Integer commentScore;

    @TableField("goodCommentCount")
    private Integer goodCommentCount;

    @TableField("commonCommentCount")
    private Integer commonCommentCount;

    @TableField("badCommentCount")
    private Integer badCommentCount;

    /**
     * 媒体属性
     */
    private String medias;
    @TableField(exist=false)
    private String description;
    @TableField(exist=false)
    private String reichContent;

}

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
 * 品牌信息
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TBrand implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private Long createTime;

    @TableField("updateTime")
    private Long updateTime;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 英文名
     */
    @TableField("englishName")
    private String englishName;

    /**
     * 首字母
     */
    @TableField("firstLetter")
    private String firstLetter;

    private String description;

    /**
     * 商品分类ID
     */
    private Long productTypeId;

    @TableField("sortIndex")
    private Integer sortIndex;

    /**
     * 品牌LOGO
     */
    private String logo;


}

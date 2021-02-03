package com.shopping.product.domain;

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
public class FileInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 文件md5
     */
    private String id;

    @TableField("contentType")
    private String contentType;

    private Integer size;

    /**
     * 物理路径
     */
    private String path;

    private String url;

    private Integer type;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("updateTime")
    private LocalDateTime updateTime;


}

package com.shopping.product.domain;

import lombok.Data;

@Data
public class PageBo {
    private Integer rows;
    private Integer page;
    private String keyWords;
    private Long product_type_id;
     
}

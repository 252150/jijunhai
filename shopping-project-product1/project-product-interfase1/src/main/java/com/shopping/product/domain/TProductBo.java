package com.shopping.product.domain;

import java.util.List;

import lombok.Data;
@Data
public class TProductBo {
     private Long productId;
     private List<TSpecification> skuProperties;
     private  List<TSku>skus;
}

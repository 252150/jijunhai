package com.shopping.product.service;

import com.shopping.product.domain.TSpecification;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品属性 服务类
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
public interface ITSpecificationService extends IService<TSpecification> {
    public List<TSpecification> listSku(Long prductId);
    
}

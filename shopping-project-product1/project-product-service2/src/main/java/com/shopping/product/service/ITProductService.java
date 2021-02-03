package com.shopping.product.service;

import com.shopping.product.domain.TProduct;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
public interface ITProductService extends IService<TProduct> {
    public void saveProduct(TProduct tProduct);
}

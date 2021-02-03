package com.shopping.product.mapper;

import com.shopping.product.domain.TProduct;

import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
public interface TProductMapper extends BaseMapper<TProduct> {
	void onSale(Map<String, Object> params);//上架
	void offSale(Map<String, Object> params);//下架
}

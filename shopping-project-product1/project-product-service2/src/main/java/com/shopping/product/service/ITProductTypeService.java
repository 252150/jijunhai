package com.shopping.product.service;

import com.shopping.product.domain.TProductType;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
public interface ITProductTypeService extends IService<TProductType> {
	public  boolean save(TProductType tProductType);
	public List<TProductType> listSku(Long prductId);
}

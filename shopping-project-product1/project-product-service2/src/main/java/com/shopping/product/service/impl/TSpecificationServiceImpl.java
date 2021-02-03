package com.shopping.product.service.impl;

import com.shopping.product.domain.TSpecification;
import com.shopping.product.mapper.TSpecificationMapper;
import com.shopping.product.service.ITSpecificationService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品属性 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@Service
public class TSpecificationServiceImpl extends ServiceImpl<TSpecificationMapper, TSpecification> implements ITSpecificationService {

	@Override
	public List<TSpecification> listSku(Long prductId) {
		return list(new QueryWrapper<TSpecification>().eq("product_type_id", prductId).eq("isSku", 1));
		
	}

}

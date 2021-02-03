package com.shopping.product.service.impl;

import com.shopping.product.domain.TProductType;
import com.shopping.product.mapper.TProductTypeMapper;
import com.shopping.product.service.ITProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@Service
public class TProductTypeServiceImpl extends ServiceImpl<TProductTypeMapper, TProductType> implements ITProductTypeService {

	@Override
	public List<TProductType> listSku(Long prductId) {
		// TODO Auto-generated method stub
		return null;
	}

}

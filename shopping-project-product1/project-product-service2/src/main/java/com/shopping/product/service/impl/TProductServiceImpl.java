package com.shopping.product.service.impl;

import com.shopping.product.domain.TProduct;
import com.shopping.product.domain.TProductExt;
import com.shopping.product.mapper.TProductMapper;
import com.shopping.product.service.ITProductExtService;
import com.shopping.product.service.ITProductService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@Service
public class TProductServiceImpl extends ServiceImpl<TProductMapper, TProduct> implements ITProductService {
    @Autowired
	private ITProductExtService iTProductExtService;
	@Transactional
	@Override
	public void saveProduct(TProduct tProduct) {
		saveOrUpdate(tProduct);
		TProductExt tpe=iTProductExtService.getOne(new QueryWrapper<TProductExt>().eq("product_id",tProduct.getId() ));
		tpe=tpe==null?new TProductExt():tpe;
		tpe.setDescription(tProduct.getDescription());
		tpe.setProductId(tProduct.getId());
		tpe.setRichContent(tProduct.getReichContent());	
		iTProductExtService.saveOrUpdate(tpe);
	}

}

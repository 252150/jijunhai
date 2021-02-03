package com.shopping.product.service.impl;

import com.shopping.product.domain.TBrand;
import com.shopping.product.mapper.BrandMapper;
import com.shopping.product.service.BrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-12-24
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, TBrand> implements BrandService {
    @Autowired    
	BrandMapper brandMapper;
          public int insert(TBrand tBrand) {
        	int num=  brandMapper.insert(tBrand);
              return num;
          }
}

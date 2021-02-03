package com.shopping.product.service;

import com.shopping.product.domain.TProductType;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-12-24
 */
public interface ProductTypeService extends IService<TProductType> {
     public List<TProductType> findTree();
     public List<TProductType> childList(Long id);
     public List<TProductType> child();
}

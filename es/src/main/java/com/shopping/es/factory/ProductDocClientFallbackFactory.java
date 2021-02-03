package com.shopping.es.factory;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.metadata.PageList;
import com.shopping.base.bo.AjaxResult;
import com.shopping.es.domain.ProductDoc;
import com.shopping.es.feign.ProductDocClient;

import feign.hystrix.FallbackFactory; 
@Component
public class ProductDocClientFallbackFactory implements FallbackFactory<ProductDocClient>{

	public ProductDocClient create(Throwable arg0) {
		 return new ProductDocClient() {

			@Override
			public AjaxResult save(ProductDoc productDoc) {
				// TODO 自动生成的方法存根
				return null;
			}

			@Override
			public AjaxResult del(Long id) {
				// TODO 自动生成的方法存根
				return null; 
			}

			@Override
			public ProductDoc get(Long id) {
				// TODO 自动生成的方法存根
				return null;
			}

			@Override
			public AjaxResult batchSave(List<ProductDoc> productDocs) {
				// TODO 自动生成的方法存根
				return null;
			}

			@Override
			public AjaxResult batchDel(List<Long> ids) {
				// TODO 自动生成的方法存根
				return null;
			}

			@Override
			public PageList<ProductDoc> search(Map<String, Object> params) {
				// TODO 自动生成的方法存根
				return null;
			}
			 
		 };
	}

}

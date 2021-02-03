package com.shopping.es.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.PageList;
import com.shopping.es.domain.ProductDoc;
import com.shopping.es.pository.ProductDocRepository;
import com.shopping.es.service.IProductDocService;
@Service
public class ProductDocServiceImpl implements IProductDocService{
	 @Autowired
	 private ProductDocRepository repository;
	@Override
	public void add(ProductDoc productDoc) {
		// TODO 自动生成的方法存根
		repository.save(productDoc);
	}

	@Override
	public void del(Long id) {
		// TODO 自动生成的方法存根
		repository.deleteById(id);
	}

	@Override
	public ProductDoc get(Long id) {
		return  repository.findById(id).get();
	}

	@Override
	public void batchAdd(List<ProductDoc> productDocs) {
		 repository.saveAll(productDocs);
		
	}

	@Override
	public void batchDel(List<Long> ids) {
		 for (Long id : ids) {
	            repository.deleteById(id);
	        }
		
	}

	@Override
	public PageList<ProductDoc> search(Map<String, Object> params) {
		// TODO 自动生成的方法存根
		return null;
	}

}

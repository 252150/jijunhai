package com.shopping.es.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.PageList;
import com.shopping.es.domain.ProductDoc;

public interface IProductDocService {
	 void add(ProductDoc productDoc);//添加文档
	    void del(Long id);//删除文档
	    ProductDoc get(Long id);//获取文档
	    void batchAdd(List<ProductDoc> productDocs);//批量添加文档
	    void batchDel(List<Long> ids);//批量删除
	    PageList<ProductDoc> search(Map<String, Object> params);

}

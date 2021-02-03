package com.shopping.es.feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baomidou.mybatisplus.core.metadata.PageList;
import com.shopping.base.bo.AjaxResult;
import com.shopping.es.domain.ProductDoc;
import com.shopping.es.factory.ProductDocClientFallbackFactory;
@FeignClient(value = "ES-SERVER", fallbackFactory = ProductDocClientFallbackFactory.class)
@RequestMapping("/productDoc")
public interface  ProductDocClient {
	 @RequestMapping(value = "/save",method = RequestMethod.POST)
	    AjaxResult save(ProductDoc productDoc); //添加、修改
	    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	    AjaxResult del(@PathVariable("id") Long id);  //删除
	    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
	    ProductDoc get(@PathVariable("id") Long id); //获取一个

	    //批量操作
	    @RequestMapping(value = "/batchSave",method = RequestMethod.POST)
	    AjaxResult batchSave(@RequestBody List<ProductDoc> productDocs); //批量添加
	    @RequestMapping(value = "/batchDel",method = RequestMethod.DELETE)
	    AjaxResult batchDel(@RequestBody List<Long> ids); //批量上传

	    //分页搜索
	    @RequestMapping(value = "/search",method = RequestMethod.GET)
	    PageList<ProductDoc> search(Map<String,Object> params);

}

package com.shopping.es.controller;

import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.PageList;
import com.shopping.base.bo.AjaxResult;
import com.shopping.es.domain.ProductDoc;
import com.shopping.es.feign.ProductDocClient;
import com.shopping.es.service.IProductDocService;
@RestController
@RequestMapping("/productDoc")
public class ProductDocController implements ProductDocClient{
	@Autowired
    private IProductDocService productDocService;
	@Override
	 @PostMapping("/save")
	public AjaxResult save(ProductDoc productDoc) {
		  try {
			  Integer time=(int) System.currentTimeMillis();
			    productDoc.setOnSaleTime(time);
	            productDocService.add(productDoc);
	            return AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
	        }

	}

	@GetMapping("/del/{id}")
	    public  AjaxResult del(@PathVariable("id") Long id){
	        try {
	            productDocService.del(id);
	            return AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
	        }
	    }


	
	 @GetMapping("/{id}")
	    public  ProductDoc get(@PathVariable("id") Long id){
	        return productDocService.get(id);
	    }

	   @PostMapping("/saveall")
	    public  AjaxResult batchSave(@RequestBody List<ProductDoc> productDocs){
	        try {
	            productDocService.batchAdd(productDocs);
	            return AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
	        }
	    }
	    @PostMapping("dels")
	    public AjaxResult batchDel(@RequestBody List<Long> ids){
	        try {
	            productDocService.batchDel(ids);
	            return AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
	        }
	    }
	    //分页搜索
	    @GetMapping("/es")
	    public PageList<ProductDoc> search(Map<String,Object> params){
	        return productDocService.search(params);
	    }
	}




package com.shopping.product.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopping.base.bo.AjaxResult;
import com.shopping.product.domain.TProductType;
import com.shopping.product.service.ProductTypeService;
import com.shopping.redis.interfase.RedisInterfase;

/**
 * <p>
 * 商品目录 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-12-24
 */
@RestController
@RequestMapping("/productType")
public class ProductTypeController {
	@Autowired
	private RedisInterfase redisInterfase;
	@Autowired
	 private ProductTypeService productTypeService;
	private ObjectMapper objectMapper=new ObjectMapper();
	@GetMapping("/list")
     public List<TProductType> list(){
		System.out.print("aaa");
    	 return productTypeService.findTree();
     }
	@PostMapping("/save")
	public AjaxResult save(@RequestBody TProductType tProductType) {
		try {
			productTypeService.saveOrUpdate(tProductType);
			List<TProductType> list=	productTypeService.child();
			String value = objectMapper.writeValueAsString(list);
			redisInterfase.setValue("types", value);
			return AjaxResult.getAjaxResult().setMsg("保存成功").setCode(200);
		}
		catch(Exception e) {
			e.printStackTrace();
			return AjaxResult.getAjaxResult().setMsg("保存失败").setCode(500);
		}
		
	}
	@PostMapping("/delete")
	public AjaxResult save(@RequestBody List<Integer> ids) {
		try {
			productTypeService.removeByIds(ids);
			List<TProductType> list=	productTypeService.child();
			String value = objectMapper.writeValueAsString(list);
			redisInterfase.setValue("types", value);
			return AjaxResult.getAjaxResult().setMsg("保存成功").setCode(200);
		}
		catch(Exception e) {
			e.printStackTrace();
			return AjaxResult.getAjaxResult().setMsg("保存失败").setCode(500);
		}
	}
}


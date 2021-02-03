package com.shopping.product.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.shopping.product.domain.TProductExt;
import com.shopping.product.domain.TSku;
import com.shopping.product.domain.TSpecification;
import com.shopping.product.service.ITProductExtService;
import com.shopping.product.service.ITProductService;
import com.shopping.product.service.ITSkuService;

/**
 * <p>
 * 商品扩展 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@RestController
@RequestMapping("/productExt")
public class TProductExtController {
	@Autowired
	private ITSkuService iTSkuService;
	@Autowired
	private ITProductExtService iTProductExtService;
	@GetMapping("/list/{productId}")
     public Map<String,Object> list(@PathVariable("productId") Long productId){
		Map<String,Object> map=new HashMap<String,Object>();
		List<TProductExt> list=iTProductExtService.list(new QueryWrapper<TProductExt>().eq("product_id", productId));
	    String skuProperties=null;
		for(TProductExt tpe:list) {
			skuProperties=	tpe.getSkuProperties();
	    }
		 List<TSpecification> list1 = JSON.parseArray(skuProperties, TSpecification.class);
		List<TSku> skus=iTSkuService.list(new QueryWrapper<TSku>().eq("product_id", productId));
		 map.put("skuProperties", list1);
		 map.put("skus", skus);
		 return map;
     }
}


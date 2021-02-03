package com.shopping.product.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shopping.base.bo.AjaxResult;
import com.shopping.product.domain.TProductBo;
import com.shopping.product.domain.TProductExt;
import com.shopping.product.domain.TSku;
import com.shopping.product.domain.TSpecification;
import com.shopping.product.service.ITProductExtService;
import com.shopping.product.service.ITSkuService;
import com.shopping.product.service.ITSpecificationService;

/**
 * <p>
 * SKU 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@RestController
@RequestMapping("/sku")
public class TSkuController {
	@Autowired
	private ITSkuService iTSkuService;
	
	@Autowired
	private ITProductExtService iTProductExtService;



	@PostMapping("/addSku")
      public AjaxResult addSku(@RequestBody TProductBo tProductBo) {
    	  try { 
    	 List<TSpecification> tes =tProductBo.getSkuProperties();
             String sku=JSON.toJSONString(tes); 
    		TProductExt te=new TProductExt();
    		te.setProductId(tProductBo.getProductId());
    	   te.setSkuProperties(sku);
    		  List <TSku> list =tProductBo.getSkus();
    		  Long time=System.currentTimeMillis();
    		  List <TSku> list1=new ArrayList<TSku>();
    		  for(TSku tSku:list) {
    			  
    			  tSku.setProductId(tProductBo.getProductId());
    			  tSku.setCreateTime(time);
    			  tSku.setUpdateTime(time);
    			  list1.add(tSku);
    		  }
    		  iTSkuService.saveOrUpdateBatch(list1);
    		  iTProductExtService.saveOrUpdate(te);
    		return  AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
    	  }
    	  catch(Exception e) {
    		  e.printStackTrace();
    		  return AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
    	  }
      }
      }


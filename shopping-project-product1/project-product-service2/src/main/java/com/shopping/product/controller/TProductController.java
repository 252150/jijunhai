package com.shopping.product.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shopping.base.bo.AjaxResult;
import com.shopping.product.domain.PageBo;
import com.shopping.product.domain.TBrand;
import com.shopping.product.domain.TProduct;
import com.shopping.product.domain.TSpecification;
import com.shopping.product.service.ITProductService;
import com.shopping.product.service.ITSpecificationService;


/**
 * <p>
 * 商品 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@RestController
@RequestMapping("/product")
public class TProductController {
	@Autowired
	private ITProductService iTProductService;
	@Autowired
	private ITSpecificationService iTSpecificationService;

	@PostMapping("/list")
     public IPage<TProduct> list(@RequestBody PageBo pageBo){
		Page<TProduct> page=new Page<>(pageBo.getPage(),pageBo.getRows());
		
		return iTProductService.page(page, new QueryWrapper<TProduct>().like("name", pageBo.getKeyWords())
				.or().like("subName", pageBo.getKeyWords()));
    	 
     }
	@PostMapping("/save")
	public AjaxResult save(@RequestBody TProduct tproduct) {
		try {
			if(tproduct.getId()==null) {
				Long time=System.currentTimeMillis();
				tproduct.setCreateTime(time);
				tproduct.setUpdateTime(time);
			}else {
				tproduct.setUpdateTime(System.currentTimeMillis());
			}
			iTProductService.saveProduct(tproduct);
			return AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
		}	
		catch(Exception e) {
			e.printStackTrace();
			return AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
		}
		}
	@PostMapping("/deletes")
	public AjaxResult delete(@RequestBody List<Integer> ids) {
		
		try {
			iTProductService.removeByIds(ids);
			return AjaxResult.getAjaxResult().setMsg("删除成功").setCode(200);
		}catch(Exception e){
			e.printStackTrace();
			return AjaxResult.getAjaxResult().setMsg("删除失败").setCode(500);
		}
	}
	@PostMapping("/saveOnTime")
	public AjaxResult saveOnTime(@RequestBody TProduct tproduct) {
		try {
	
				Long time=System.currentTimeMillis();
			
				tproduct.setOnSaleTime(time);
				tproduct.setState(1);
			iTProductService.saveOrUpdate(tproduct);
			return AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
		}	
		catch(Exception e) {
			e.printStackTrace();
			return AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
		}
		}
	@PostMapping("/offSaleTime")
	public AjaxResult offSaleTime(@RequestBody TProduct tproduct) {
		try {
	
				Long time=System.currentTimeMillis();
			
				tproduct.setOnSaleTime(time);
				tproduct.setState(0);
			iTProductService.saveOrUpdate(tproduct);
			
			return AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
		}	
		catch(Exception e) {
			e.printStackTrace();
			return AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
		}
		}
	@GetMapping("listSku/{productTypeId}")
	public List<TSpecification> listSku(@PathVariable("productTypeId") Long productTypeId) {
		return iTSpecificationService.listSku(productTypeId);
	}
}


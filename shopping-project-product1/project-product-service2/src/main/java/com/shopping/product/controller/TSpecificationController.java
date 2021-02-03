package com.shopping.product.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.shopping.product.domain.TSpecification;
import com.shopping.product.service.ITSpecificationService;

/**
 * <p>
 * 商品属性 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@RestController
@RequestMapping("/specification")
public class TSpecificationController {
	@Autowired
	private ITSpecificationService iTSpecificationService;
	@PostMapping("/list")
    public IPage<TSpecification> pageList(@RequestBody PageBo pageBo){

		Page<TSpecification> page=new Page<>(pageBo.getPage(),pageBo.getRows());
		System.out.println(pageBo.getProduct_type_id());
		return iTSpecificationService.page(page, new QueryWrapper<TSpecification>().like("product_type_id", pageBo.getProduct_type_id()));
		
    }
	@PostMapping("/save")
	public AjaxResult save(@RequestBody TSpecification tSpecification ) {
		try {
			iTSpecificationService.saveOrUpdate(tSpecification);
			return AjaxResult.getAjaxResult().setCode(200).setMsg("保存成功");
		}catch(Exception e) {
			e.printStackTrace();
			return	AjaxResult.getAjaxResult().setCode(500).setMsg("保存失败");
		}
	}
	@PostMapping("/delete")
	public AjaxResult delete(@RequestBody List<Integer> ids) {
		try {
			iTSpecificationService.removeByIds(ids);
			return AjaxResult.getAjaxResult().setCode(200).setMsg("删除成功");
		}catch(Exception e) {
			e.printStackTrace();
			return	AjaxResult.getAjaxResult().setCode(500).setMsg("删除失败");
		}
	}
}


package com.shopping.product.controller;


import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shopping.base.bo.AjaxResult;
import com.shopping.product.domain.PageBo;
import com.shopping.product.domain.TBrand;
import com.shopping.product.service.BrandService;

/**
 * <p>
 * 品牌信息 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-12-24
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
	@Autowired
	private BrandService brandService;
	@PostMapping("/list")
    public IPage<TBrand> pageList(@RequestBody PageBo pageBo){

		Page<TBrand> page=new Page<>(pageBo.getPage(),pageBo.getRows());
		
		return brandService.page(page, new QueryWrapper<TBrand>().like("englishName", pageBo.getKeyWords())
				.or().like("name", pageBo.getKeyWords()));
    }
	@PostMapping("/save")
    public  AjaxResult save(@RequestBody TBrand brand) {
    	try {
    		Long time=System.currentTimeMillis();
    		if(brand.getId()==null) brand.setCreateTime(time);
    		brand.setUpdateTime(time);
    		brandService.saveOrUpdate(brand);
    		return AjaxResult.getAjaxResult().setMsg("保存成功").setCode(200);
    	}catch(Exception e){
    		e.printStackTrace();
    		return AjaxResult.getAjaxResult().setMsg("保存失败").setCode(500);
    	}
    }
	@GetMapping("/delete1/{id}")
     public AjaxResult delete1(@PathParam("id") Long id) {
    	 try {
    		 brandService.removeById(id);
    		 return AjaxResult.getAjaxResult().setCode(200).setMsg("删除成功");
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    		 return AjaxResult.getAjaxResult().setCode(500).setMsg("删除失败");
    	 }
     }
	@PostMapping("/deletes")
	public AjaxResult delete(@RequestBody List<Integer> ids) {
		
		try {
			brandService.removeByIds(ids);
			return AjaxResult.getAjaxResult().setMsg("删除成功").setCode(200);
		}catch(Exception e){
			e.printStackTrace();
			return AjaxResult.getAjaxResult().setMsg("删除失败").setCode(500);
		}
	}
}


package com.shopping.product.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.base.bo.AjaxResult;
import com.shopping.product.domain.TMail;
import com.shopping.product.service.ITMailService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@RestController
@RequestMapping("/tMail")
public class TMailController {
	@Autowired
	ITMailService iTMailService;
	@PostMapping("/saveOrUpdate")
	public AjaxResult saveOrUpdate(@RequestBody TMail tMail) {
		boolean bool=	iTMailService.saveOrUpdate(tMail);
		if(bool)return AjaxResult.getAjaxResult().setCode(200).setMsg("新增成功");
		return AjaxResult.getAjaxResult().setCode(500).setMsg("新增失败");
	}
}


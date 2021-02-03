package com.shopping.product.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Ʒ 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@RestController
@RequestMapping("/cPawnAttrGroupCatRel")
public class CPawnAttrGroupCatRelController {
	    @GetMapping("/getport")
        public String getS() {
        	return "pre";
        }
}


package com.shopping.product.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.shopping.base.bo.AjaxResult;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@RestController
@RequestMapping("/cPawnAttrGroup")
public class CPawnAttrGroupController {
       @GetMapping("/get")
       public AjaxResult A() {
    	   return null;
       }
}


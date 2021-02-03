package com.shopping.commons.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.commons.util.RedisUtil;
import com.shopping.redis.interfase.RedisInterfase;

@RestController
@RequestMapping("/redis")
public class RedisController implements RedisInterfase{
	@GetMapping("/get")
   public String getValue(@RequestParam("key") String key) {
	   return RedisUtil.GetValue(key);
   }
	@PostMapping("/set")
	 public void setValue(@RequestParam("key") String key,@RequestParam("value") String value) {
		   RedisUtil.SetValue(key, value);
	   }
}
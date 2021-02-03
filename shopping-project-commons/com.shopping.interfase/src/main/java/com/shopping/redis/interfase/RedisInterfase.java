package com.shopping.redis.interfase;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(value="COMMENTS-SERVER")
@RequestMapping("/redis")
public interface RedisInterfase {
	@GetMapping("/get")
	   public String getValue(@RequestParam("key") String key) ;

		@PostMapping("/set")
		 public void setValue(@RequestParam("key") String key,@RequestParam("value") String value) ;
	
}

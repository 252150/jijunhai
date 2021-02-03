package com.shopping.zuul.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

import com.netflix.zuul.exception.ZuulException;

@Component
public class TokenFilter extends ZuulFilter{
	@Value("${server.port}")
    private String serverPort;
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("网关的端口:"+serverPort);
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
      
}

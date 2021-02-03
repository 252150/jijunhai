package com.shopping.es;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import com.shopping.es.domain.ProductDoc;


@SpringBootApplication

public class ESserver {
	@Autowired
    private ElasticsearchTemplate template;
    public static void main(String[] args) {
    	SpringApplication.run(ESserver.class, args);
	}
}

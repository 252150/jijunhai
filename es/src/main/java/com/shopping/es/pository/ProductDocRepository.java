package com.shopping.es.pository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.shopping.es.domain.ProductDoc;
@Repository
public interface  ProductDocRepository extends ElasticsearchRepository<ProductDoc,Long>{
     
}

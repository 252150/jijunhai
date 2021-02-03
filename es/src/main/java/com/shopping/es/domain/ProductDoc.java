package com.shopping.es.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "product",type = "product")
public class ProductDoc {
	   @Id
	    private Long id;
	    private Long productTypeId;//类型id
	    private Long brandId;//品牌id
	    private Integer minPrice;//最小价格
	    private Integer maxPrice;//最大价格
	    private Integer saleCount;//销量
	    private Integer onSaleTime;//上架时间
	    private Integer commentCount;//评论总数
	    private Integer viewCount;//浏览数

	    @Field(type = FieldType.Keyword)
	    List<String> images = new ArrayList<>();//图片
	    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
	    private String all;//模糊查询所有字段 name、subName、brandName、productTypeName
	    @Field(type = FieldType.Keyword)
	    private String viewProperties;//显示属性
	    @Field(type = FieldType.Keyword)
	    private String skuProperties;//sku属性
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getProductTypeId() {
			return productTypeId;
		}
		public void setProductTypeId(Long productTypeId) {
			this.productTypeId = productTypeId;
		}
		public Long getBrandId() {
			return brandId;
		}
		public void setBrandId(Long brandId) {
			this.brandId = brandId;
		}
		public Integer getMinPrice() {
			return minPrice;
		}
		public void setMinPrice(Integer minPrice) {
			this.minPrice = minPrice;
		}
		public Integer getMaxPrice() {
			return maxPrice;
		}
		public void setMaxPrice(Integer maxPrice) {
			this.maxPrice = maxPrice;
		}
		public Integer getSaleCount() {
			return saleCount;
		}
		public void setSaleCount(Integer saleCount) {
			this.saleCount = saleCount;
		}
		public Integer getOnSaleTime() {
			return onSaleTime;
		}
		public void setOnSaleTime(Integer onSaleTime) {
			this.onSaleTime = onSaleTime;
		}
		public Integer getCommentCount() {
			return commentCount;
		}
		public void setCommentCount(Integer commentCount) {
			this.commentCount = commentCount;
		}
		public Integer getViewCount() {
			return viewCount;
		}
		public void setViewCount(Integer viewCount) {
			this.viewCount = viewCount;
		}
		public List<String> getImages() {
			return images;
		}
		public void setImages(List<String> images) {
			this.images = images;
		}
		public String getAll() {
			return all;
		}
		public void setAll(String all) {
			this.all = all;
		}
		public String getViewProperties() {
			return viewProperties;
		}
		public void setViewProperties(String viewProperties) {
			this.viewProperties = viewProperties;
		}
		public String getSkuProperties() {
			return skuProperties;
		}
		public void setSkuProperties(String skuProperties) {
			this.skuProperties = skuProperties;
		}
        
}

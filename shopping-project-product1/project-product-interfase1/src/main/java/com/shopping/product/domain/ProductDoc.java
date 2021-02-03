package com.shopping.product.domain;

import org.springframework.data.annotation.Id;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;



public class ProductDoc {

	@Id
	    private Long id;

	  
	    private Long createTime;

	    private Long updateTime;

	    /**
	     * 商品名称
	     */
	    private String name;

	    /**
	     * 副名称
	     */

	    private String subName;

	    /**
	     * 商品编码
	     */
	    private String code;

	    /**
	     * 商品类型ID
	     */
	    private Long productTypeId;

	    /**
	     * 上架时间
	     */
	
	    private Long onSaleTime;

	    /**
	     * 下架时间
	     */
	    @TableField("offSaleTime")
	    private Long offSaleTime;

	    private Long brandId;

	    /**
	     * 状态
	     */
	    private Integer state;

	    /**
	     * 最高价
	     */
	   
	    private Integer maxPrice;

	    /**
	     * 最低价
	     */
	  
	    private Integer minPrice;

	    /**
	     * 销量
	     */
	    @TableField("saleCount")
	    private Integer saleCount;

	    /**
	     * 浏览量
	     */
	
	    private Integer viewCount;

	    /**
	     * 评论数
	     */
	    @TableField("commentCount")
	    private Integer commentCount;

	    /**
	     * 评分
	     */
	  
	    private Integer commentScore;

	  
	    private Integer goodCommentCount;

	  
	    private Integer commonCommentCount;

	    @TableField("badCommentCount")
	    private Integer badCommentCount;

	    /**
	     * 媒体属性
	     */
	    private String medias;
	
	    private String description;
	 
	    private String reichContent;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSubName() {
			return subName;
		}

		public void setSubName(String subName) {
			this.subName = subName;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Long getProductTypeId() {
			return productTypeId;
		}

		public void setProductTypeId(Long productTypeId) {
			this.productTypeId = productTypeId;
		}

		public Long getOnSaleTime() {
			return onSaleTime;
		}

		public void setOnSaleTime(Long onSaleTime) {
			this.onSaleTime = onSaleTime;
		}

		public Long getOffSaleTime() {
			return offSaleTime;
		}

		public void setOffSaleTime(Long offSaleTime) {
			this.offSaleTime = offSaleTime;
		}

		public Long getBrandId() {
			return brandId;
		}

		public void setBrandId(Long brandId) {
			this.brandId = brandId;
		}

		public Integer getState() {
			return state;
		}

		public void setState(Integer state) {
			this.state = state;
		}

		public Integer getMaxPrice() {
			return maxPrice;
		}

		public void setMaxPrice(Integer maxPrice) {
			this.maxPrice = maxPrice;
		}

		public Integer getMinPrice() {
			return minPrice;
		}

		public void setMinPrice(Integer minPrice) {
			this.minPrice = minPrice;
		}

		public Integer getSaleCount() {
			return saleCount;
		}

		public void setSaleCount(Integer saleCount) {
			this.saleCount = saleCount;
		}

		public Integer getViewCount() {
			return viewCount;
		}

		public void setViewCount(Integer viewCount) {
			this.viewCount = viewCount;
		}

		public Integer getCommentCount() {
			return commentCount;
		}

		public void setCommentCount(Integer commentCount) {
			this.commentCount = commentCount;
		}

		public Integer getCommentScore() {
			return commentScore;
		}

		public void setCommentScore(Integer commentScore) {
			this.commentScore = commentScore;
		}

		public Integer getGoodCommentCount() {
			return goodCommentCount;
		}

		public void setGoodCommentCount(Integer goodCommentCount) {
			this.goodCommentCount = goodCommentCount;
		}

		public Integer getCommonCommentCount() {
			return commonCommentCount;
		}

		public void setCommonCommentCount(Integer commonCommentCount) {
			this.commonCommentCount = commonCommentCount;
		}

		public Integer getBadCommentCount() {
			return badCommentCount;
		}

		public void setBadCommentCount(Integer badCommentCount) {
			this.badCommentCount = badCommentCount;
		}

		public String getMedias() {
			return medias;
		}

		public void setMedias(String medias) {
			this.medias = medias;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getReichContent() {
			return reichContent;
		}

		public void setReichContent(String reichContent) {
			this.reichContent = reichContent;
		}
	    
}

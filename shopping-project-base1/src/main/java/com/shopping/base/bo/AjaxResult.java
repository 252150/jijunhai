package com.shopping.base.bo;

public  class AjaxResult {
   private Integer code;
   private String msg;
   private Object data;
   public static AjaxResult  getAjaxResult() {
	   AjaxResult ar=new AjaxResult(); 
	   
	   ar.setCode(200);
	   return ar;
   }
public Integer getCode() {
	return code;
}
public AjaxResult setCode(Integer code) {
	this.code = code;
	return this;
}
public String getMsg() {
	return msg;
}
public AjaxResult setMsg(String msg) {
	this.msg = msg;
	return this;
}
public Object getData() {
	return data;
}
public AjaxResult setData(Object data) {
	this.data = data;
	return this;
} 
   
}

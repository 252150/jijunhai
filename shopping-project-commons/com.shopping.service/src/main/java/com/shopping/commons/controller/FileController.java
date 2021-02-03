package com.shopping.commons.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.shopping.base.bo.AjaxResult;
import com.shopping.commons.util.FastdfsUtil;


@RestController
@RequestMapping("/file")
public class FileController {
   @PostMapping("/upload")
	 public AjaxResult uploadFile(@RequestParam MultipartFile file) {
    	 try {
    		 
    			    String exName=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

    			String fdfsName=    FastdfsUtil.upload(file.getBytes(), exName);
    		return  AjaxResult.getAjaxResult().setMsg("上传成功").setCode(200).setData(fdfsName);
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    		 return  AjaxResult.getAjaxResult().setMsg("上传失败").setCode(500);
    	 }
     }
}

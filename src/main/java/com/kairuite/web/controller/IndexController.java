package com.kairuite.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	// 首页
    @GetMapping("/index")
    public String index(ModelMap mmap) {
    	return "index";
    }
    
    // 产品中心
    @GetMapping("/product")
    public String product(ModelMap mmap) {
    	return "product";
    }
    
    // 产品中心-产品介绍
    @GetMapping("/Product_into")
    public String Product_into(ModelMap mmap) {
    	return "Product_into";
    }
    
    // 彩印纸箱
    @GetMapping("/Product_into1")
    public String Product_into1(ModelMap mmap) {
    	return "Product_into1";
    }
    
    // 牛皮纸箱
    @GetMapping("/Product_into2")
    public String Product_into2(ModelMap mmap) {
    	return "Product_into2";
    }
    
    // 瓦楞纸
    @GetMapping("/Product_into3")
    public String Product_into3(ModelMap mmap) {
    	return "Product_into3";
    }
    
    // 定制纸箱
    @GetMapping("/Product_into4")
    public String Product_into4(ModelMap mmap) {
    	return "Product_into4";
    }
    
    // 产品五
    @GetMapping("/Product_into5")
    public String Product_into5(ModelMap mmap) {
    	return "Product_into5";
    }
    
    // 客户案例
    @GetMapping("/Case")
    public String Case(ModelMap mmap) {
    	return "Case";
    }
    
    //公司动态
    @GetMapping("/dynamic")
    public String dynamic(ModelMap mmap) {
    	return "dynamic";
    }
    
    //公司简介
    @GetMapping("/Company")
    public String Company(ModelMap mmap) {
    	return "Company";
    }
    
    //联系方式
    @GetMapping("/Contact")
    public String Contact(ModelMap mmap) {
    	return "Contact";
    }

}

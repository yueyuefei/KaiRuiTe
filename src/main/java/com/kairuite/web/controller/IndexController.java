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

}

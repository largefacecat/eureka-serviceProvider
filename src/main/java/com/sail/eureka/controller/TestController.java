package com.sail.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @author : zf
* @create_time : 2018年7月13日 上午9:17:03 
* @description :
*/
@RestController
public class TestController {
	Logger log = LoggerFactory.getLogger(getClass()); 
	
	
	@GetMapping(value = "/test")
	public String test(){
		return "this is the 'test controller'!";
	}
	
	@GetMapping(value = "/hi")
	public String hi(String name){
		return "hello!"+name;
	}
	
}

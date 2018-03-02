package com.example.applicationcontext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.applicationcontext.dao.DlUserMapper;
import com.example.applicationcontext.entity.DlUser;


@RestController
@SpringBootApplication
@RequestMapping("/")
public class HelloController {
	
	@Autowired
	private DlUserMapper dlUserDao;
	
	@RequestMapping("/")
	@ResponseBody
    public String hello(){
		DlUser dlUser = dlUserDao.selectById(3);
		String json = JSONObject.toJSONString(dlUser);
        return json;
    }
}

package com.fight.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fight.cn.service.impl.UserServiceManagerImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceManagerImpl usmi;
}

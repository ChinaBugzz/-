package com.fight.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fight.cn.dao.mapper.IUserMapper;
import com.fight.cn.service.IUserServiceManager;

@Service("userServiceManager")
public class UserServiceManagerImpl implements IUserServiceManager{
	
	@Autowired
	private IUserMapper userMapper;
	
	
}

package com.louis.springboot.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.springboot.demo.config.dds.DataSource;
import com.louis.springboot.demo.dao.SysUserMapper;
import com.louis.springboot.demo.model.SysUser;
import com.louis.springboot.demo.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
    
    @Autowired
    private SysUserMapper sysUserMapper;
    
    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }

	@Override
	@DataSource(value="master")
	public List<SysUser> findAll1() {
		return sysUserMapper.selectAll();
	}

	@Override
	@DataSource(value="slave")
	public List<SysUser> findAll2() {
		return sysUserMapper.selectAll();
	}
}
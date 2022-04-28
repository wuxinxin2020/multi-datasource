package com.louis.springboot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.louis.springboot.demo.service.SysUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	private SysUserService sysUserService;

	@Test
	public void contextLoads() {
		System.out.println(sysUserService.findAll1());
		System.out.println(sysUserService.findAll2());
	}

}

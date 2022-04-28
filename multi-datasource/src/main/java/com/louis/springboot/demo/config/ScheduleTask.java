package com.louis.springboot.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.louis.springboot.demo.service.SysUserService;

@Configuration
@EnableScheduling
public class ScheduleTask {
	
	@Autowired
	private SysUserService sysUserService;

    @Scheduled(cron = "0/5 * * * * ?")
    private void configureTasks() {
    	System.out.println(sysUserService.findAll1());
    }
    
    @Scheduled(cron = "0/5 * * * * ?")
    private void configureTasks2() {
    	System.out.println(sysUserService.findAll2());
    }
}

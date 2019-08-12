package com.guochenglong.bean;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guochenglong.utils.RandomUitl;
import com.guochenglong.utils.StringUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserTestJSON {

	@Resource
	private RedisTemplate<String, Serializable> redisTemplate;
	
	
		@Test
		public void test() {
			List<User>   list=new ArrayList<User>();
			for (int i = 1; i < 100000; i++) {
									//id       姓名																			
				list.add(new User(i,StringUtil.generateChineseName()+StringUtil.randomChineseString(2),
						StringUtil.generateChineseNamec(),//性别	 	
						13+RandomUitl.phones(9),//手机号
						RandomUitl.randomStringZIfu(RandomUitl.random(3, 20))+StringUtil.generateChineseNameemyel(),//邮箱
						RandomUitl.random(18, 70)));//年龄
			}
			
			//开始时间
			long currentTimeMillis = System.currentTimeMillis();
			for (User user : list) {
				
				redisTemplate.opsForList().leftPush("User", user);
			}
			
			long endTimeMillis = System.currentTimeMillis();
			
			System.out.println("json添加100000跳所用的时间 "+(endTimeMillis - currentTimeMillis));
		}
}

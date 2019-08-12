package com.guochenglong.bean;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guochenglong.utils.RandomUitl;
import com.guochenglong.utils.StringUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserTestbean {

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
		
	}
	
	@Test
	public void test1() {
	
								//id       姓名																			
			User  cc= new User(100000001,StringUtil.generateChineseName()+StringUtil.randomChineseString(2),
					StringUtil.generateChineseNamec(),//性别	 	
					13+RandomUitl.phones(9),//手机号
					RandomUitl.randomStringZIfu(RandomUitl.random(3, 20))+StringUtil.generateChineseNameemyel(),//邮箱
					RandomUitl.random(18, 70));//年龄
		//输出 一下 
			System.out.println(cc);
		
	}

}

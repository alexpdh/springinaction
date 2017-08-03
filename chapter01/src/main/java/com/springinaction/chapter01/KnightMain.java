package com.springinaction.chapter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: pengdh
 * @create: 2017-08-03 16:46
 */
public class KnightMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
	}
}

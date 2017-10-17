package com.springinaction.chapter02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: alexpdh
 * @date: 2017-10-17 0:15
 */
@Configuration
public class CDPlayerConfig {
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
}

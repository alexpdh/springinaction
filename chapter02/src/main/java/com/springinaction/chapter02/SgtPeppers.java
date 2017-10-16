package com.springinaction.chapter02;

import org.springframework.stereotype.Component;

/**
 * @auther: alexpdh
 * @create: 2017-10-17 0:02
 */
@Component
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	@Override
	public void player() {
		System.out.println("Playing " + title + " by " + artist);
	}
}

package com.springinaction.chapter01;

import java.io.PrintStream;

/**
 * @auther: pengdh
 * @create: 2017-08-03 16:57
 */
public class Minstrel {
	private PrintStream stream;

	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	public void singBeforeQuest() {
		stream.println("探险之前调用");
	}
	public void singAfterQuest() {
		stream.println("探险之后调用");
	}
}

package com.springinaction.chapter01;

import java.io.PrintStream;

/**
 * @auther: pengdh
 * @create: 2017-08-03 16:04
 */
public class SlayDragonQuest implements Quest {
	private PrintStream stream;

	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void embark() {
		stream.println("Embarking on quest to slay the dragon!");
	}
}

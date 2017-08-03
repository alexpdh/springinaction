package com.springinaction.chapter01;

/**
 * @auther: pengdh
 * @create: 2017-08-03 15:46
 */
public class BraveKnight implements Knight {
	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}
}

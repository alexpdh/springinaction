package com.springinaction.chapter01;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

/**
 * Created by Administrator on 2017/8/3.
 */
public class BraveKnightTest {

	@Test
	public void embarkOnQuest() throws Exception {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}

}
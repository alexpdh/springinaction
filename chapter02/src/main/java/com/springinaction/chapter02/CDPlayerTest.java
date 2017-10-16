package com.springinaction.chapter02;

import static junit.framework.TestCase.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @auther: alexpdh
 * @create: 2017-10-17 0:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CDPlayerTest {

	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNUll() {
		assertNotNull(cd);
	}
}

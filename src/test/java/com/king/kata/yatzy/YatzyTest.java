package com.king.kata.yatzy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YatzyTest {

	private YatzyScorer yatzyScorer;

	@Before
	public void setUp() throws Exception {
		yatzyScorer = new YatzyScorer();
	}

	@Test
	public void chanceScoresCorrectly() throws Exception {
		int score = yatzyScorer.calculateScore(Category.CHANCE, new YatzyRoll(5, 2, 1, 4, 6));
		Assert.assertEquals(18, score);
	}
}

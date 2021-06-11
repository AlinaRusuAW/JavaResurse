package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

	private Fish fish;

	@BeforeEach
	void setUp() {
		fish = new Fish();
	}

	@Test
	void dive1() {
		fish.dive(1);

		assertEquals(1, fish.currentDepth);
	}

	@Test
	void dive123() {
		int howDeep1 = 1, howDeep2 = 1, howDeep3 = 2;

		fish.dive(howDeep1);
		fish.dive(howDeep2);
		fish.dive(howDeep3);

		assertEquals(howDeep1 + howDeep2 + howDeep3, fish.currentDepth);
	}

	@Test
	void dive_loop() {
		int howDeepArray[] = new int[]{1, 1, 2, 3, 5, 8, 13};
		int sum = 0;

		for (int howDeep : howDeepArray) {
			fish.dive(howDeep);
			sum += howDeep; // sum = sum + howDeep;
		}

		assertEquals(sum, fish.currentDepth);
	}

	@Test
	void dive_floatOut() {
		int howDeep = 13;

		fish.dive(howDeep);
		fish.dive(-fish.currentDepth);

		assertEquals(0, fish.currentDepth);
	}

	@Test
	void sleep_doesNotDive() {
		int currentDepth0 = fish.currentDepth;

		fish.sleep();

		assertEquals(currentDepth0, fish.currentDepth);
	}

	@Test
	void dive_limit() {
		fish.dive(99);
		fish.dive(3);

		assertEquals(99, fish.currentDepth);
	}

	@Test
	void dive_limitRandom() {
		Random rand = new Random();
		fish.dive(100);
		fish.dive(rand.nextInt(1000) + 1);

		assertEquals(100, fish.currentDepth);
	}
}
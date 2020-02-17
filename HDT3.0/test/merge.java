package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class merge {

	@Test
	void test() {
		JUnit test = new JUnit();
		int[] actual = {2,2,3,3,4,4,5,5,7,8,23,32,34,43,76,76,345,432,658,678,763,987};
	    int[] expected = {2,2,3,3,4,4,5,5,7,8,23,32,34,43,76,76,345,432,658,678,763,987};
	    JUnit.mergeSort(actual, actual.length);
	    assertArrayEquals(expected, actual);
	}
}

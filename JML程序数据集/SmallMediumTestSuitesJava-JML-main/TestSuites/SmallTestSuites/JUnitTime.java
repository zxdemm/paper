import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitTime {

	@Test
	public void test() {
		int constructor = 0;
		int select = 2;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 15;
		int start_m = 27;
		int start_s = 27;
		int stop_h = 8;
		int stop_m = 30;
		int stop_s = 37;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test1() {
		int constructor = 0;
		int select = 4;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 21;
		int start_m = 46;
		int start_s = 27;
		int stop_h = 8;
		int stop_m = 32;
		int stop_s = 13;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(13, 14, 14);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test2() {
		int constructor = 0;
		int select = 4;
		int hour = 15;
		int minute = 59;
		int second = 19;
		int start_h = 12;
		int start_m = 16;
		int start_s = 27;
		int stop_h = 12;
		int stop_m = 24;
		int stop_s = 24;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 7, 57);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test3() {
		int constructor = 0;
		int select = 0;
		int hour = 10;
		int minute = 41;
		int second = 53;
		int start_h = 20;
		int start_m = 7;
		int start_s = 5;
		int stop_h = 7;
		int stop_m = 49;
		int stop_s = 4;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test4() {
		int constructor = 0;
		int select = 4;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 15;
		int start_m = 42;
		int start_s = 27;
		int stop_h = 21;
		int stop_m = 56;
		int stop_s = 37;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(6, 14, 10);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test5() {
		int constructor = 0;
		int select = 1;
		int hour = 23;
		int minute = 51;
		int second = 46;
		int start_h = 15;
		int start_m = 27;
		int start_s = 27;
		int stop_h = 1;
		int stop_m = 17;
		int stop_s = 37;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test6() {
		int constructor = 1;
		int select = 3;
		int hour = 16;
		int minute = 15;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 28;
		int stop_h = 8;
		int stop_m = 27;
		int stop_s = 27;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(16, 15, 16);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test7() {
		int constructor = 0;
		int select = 3;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 8;
		int start_m = 27;
		int start_s = 27;
		int stop_h = 8;
		int stop_m = 36;
		int stop_s = 57;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test8() {
		int constructor = 0;
		int select = 4;
		int hour = 11;
		int minute = 40;
		int second = 18;
		int start_h = 14;
		int start_m = 17;
		int start_s = 51;
		int stop_h = 0;
		int stop_m = 41;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(13, 36, 35);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test9() {
		int constructor = 0;
		int select = 4;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 14;
		int start_m = 14;
		int start_s = 22;
		int stop_h = 14;
		int stop_m = 14;
		int stop_s = 14;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 8);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test10() {
		int constructor = 1;
		int select = 3;
		int hour = 4;
		int minute = 45;
		int second = 46;
		int start_h = 9;
		int start_m = 57;
		int start_s = 47;
		int stop_h = 9;
		int stop_m = 57;
		int stop_s = 57;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(4, 45, 46);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test11() {
		int constructor = 1;
		int select = 4;
		int hour = 15;
		int minute = 51;
		int second = 34;
		int start_h = 9;
		int start_m = 53;
		int start_s = 24;
		int stop_h = 9;
		int stop_m = 27;
		int stop_s = 13;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 26, 11);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test12() {
		int constructor = 1;
		int select = 4;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 19;
		int start_m = 43;
		int start_s = 39;
		int stop_h = 19;
		int stop_m = 43;
		int stop_s = 43;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 4);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test13() {
		int constructor = 0;
		int select = 3;
		int hour = 8;
		int minute = 8;
		int second = 8;
		int start_h = 8;
		int start_m = 8;
		int start_s = 8;
		int stop_h = 8;
		int stop_m = 8;
		int stop_s = 8;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}
}

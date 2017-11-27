import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import icalendar.Event;

public class TDD {

	@Test
	public void testInitialiseringAfEventMedStartOgEndI2012() {
		// 3. Set-up + // 2. Execute
		LocalDateTime start = LocalDateTime.of(2012, 12, 12, 12, 12, 12);
		LocalDateTime end = LocalDateTime.of(2012, 12, 12, 13, 13, 13);
		Event event = new Event(start, end);
		
		// 1. Assert
		assertEquals(start, event.getStart());
		assertEquals(end, event.getEnd());
		
		// 4. Tear-down
	}

	@Test
	public void testInitialiseringAfEventMedStartOgEndI2011() {
		// 3. Set-up + // 2. Execute
		LocalDateTime start = LocalDateTime.of(2011, 11, 11, 11, 11, 11);
		LocalDateTime end = LocalDateTime.of(2011, 12, 11, 11, 12, 13);
		Event event = new Event(start, end);
		
		// 1. Assert
		assertEquals(start, event.getStart());
		assertEquals(end, event.getEnd());
		
		// 4. Tear-down
	}

}

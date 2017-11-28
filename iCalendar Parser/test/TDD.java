import static org.junit.Assert.*;

import java.time.Duration;
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

	@Test
	public void testInitialiseringAfEventMedStartOgDurationPaa1Time1Minut1Sekund() {
		// 3. Set-up + // 2. Execute
		LocalDateTime start = LocalDateTime.of(2012, 12, 12, 12, 12, 12);
		Duration duration = Duration.ofHours(1).plusMinutes(1).plusSeconds(1);
		LocalDateTime end = LocalDateTime.of(2012, 12, 12, 13, 13, 13);
		Event event = new Event(start, duration);
		
		// 1. Assert
		assertEquals(start, event.getStart());
		assertEquals(duration, event.getDuration());
		assertEquals(end, event.getEnd());

		// 4. Tear-down
	}
	
	@Test
	public void testTilfoejEmneTilEvent() {
		// 3. Set-up
		Event event = new Event(LocalDateTime.of(2017,12,19,18,0,0), Duration.ofHours(6));
		String summary = "Julefrokost";
		
		// 2. Execute
		event.setSummary(summary);
		
		// 1. Assert
		assertEquals(summary, event.getSummary());
	}

	@Test
	public void testTilfoejEmneMedDanskTegnTilEvent() {
		// 3. Set-up
		Event event = new Event(LocalDateTime.of(2017,12,19,18,0,0), Duration.ofHours(6));
		String summary = "Fødselsdag";
		
		// 2. Execute
		event.setSummary(summary);
		
		// 1. Assert
		assertEquals(summary, event.getSummary());
	}

}

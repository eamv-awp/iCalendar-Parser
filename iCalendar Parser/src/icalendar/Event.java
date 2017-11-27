package icalendar;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {

	private LocalDateTime start;
	private LocalDateTime end;
	private Duration duration;

	public Event(LocalDateTime start, LocalDateTime end) {
		this.start = start;
		this.end = end;
	}

	public Event(LocalDateTime start, Duration duration) {
		this.start = start;
		this.duration = duration;
		this.end = start.plus(duration);
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public Duration getDuration() {
		return duration;
	}

}

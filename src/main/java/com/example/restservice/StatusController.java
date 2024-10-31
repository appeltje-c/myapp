package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/status")
	public Status status() throws Exception {
		return new Status(counter.incrementAndGet(), " status message");
	}

}

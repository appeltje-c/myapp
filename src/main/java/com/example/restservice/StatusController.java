package com.example.restservice;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/status")
	public Status status() throws Exception {

		String ip;

		try (Socket socket = new Socket()) {
			socket.connect(new InetSocketAddress("google.com", 80));
			ip = socket.getLocalAddress().getHostAddress();
		}

		return new Status(counter.incrementAndGet(), "Status: " + ip);

	}

}

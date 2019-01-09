package com.reddit;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@PostMapping("/order")
	String  getme() {
		return "test";
	}
}

package com.hky.account.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControoler {
	@GetMapping("hi")
    public String getHi() {
    	return"Hi";
    }
}

package com.palindromic.palindromic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.palindromic.palindromic.service.PlainDromServiceInterface;

@RestController
@RequestMapping(path = "/PalinDrom")
public class PalinDromController {

	@Autowired
	private PlainDromServiceInterface plainDromServiceInterface;

	@GetMapping("/Input")
	public String getResponsePalinDrom1(@RequestParam("In") String in) {
		return plainDromServiceInterface.getResponsePalinDrom(in);
	}

}

package com.in28minutes.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaura
 *
 * with this API we need a URL setup as /courses
 * 
 * data returned would be,
 * 
 * [
 * 	{
 * 		"id": 1,
 * 		"name": "Learn AWS"
 * 		"author": "in28minutes"
 * 	}
 * ]
 */


@RestController
public class CurrencyConfigController {

	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@GetMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourse() {
		
		return configuration;
	}
	
}

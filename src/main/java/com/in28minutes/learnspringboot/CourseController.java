package com.in28minutes.learnspringboot;

import java.util.Arrays;
import java.util.List;

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
public class CourseController {

	@GetMapping("/courses")
	public List<Course> retrieveAllCourse() {
		
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn DevOps", "in28minutes"),
				new Course(3, "Learn Azure", "in28minutes")
		);
	}
	
}

package com.example.TestOpenShift.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value="/message", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity<Object> message(){
		Map<String,Object> map = new HashMap<String,Object>(); 
		map.put("Message", "OK");
		return new ResponseEntity<>(map,HttpStatus.OK);
	}

}

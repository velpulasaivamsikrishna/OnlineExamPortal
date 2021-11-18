package com.demo.onlineexamportal.exceptions.handler;




import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demo.onlineexamportal.exceptions.AdminNotFoundException;
import com.demo.onlineexamportal.exceptions.TestNotFoundException;
import com.demo.onlineexamportal.exceptions.UserNotFoundException;


@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(AdminNotFoundException.class)
	public ResponseEntity<Object> handleNonExixtingUser(AdminNotFoundException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(TestNotFoundException.class)
	public ResponseEntity<Object> handleNonExixtingRecord(TestNotFoundException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_GATEWAY);
		
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleNonExixtinglimit(UserNotFoundException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_GATEWAY);
		
	}
}

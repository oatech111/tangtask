package com.tagalong.errorhandling;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class MyExceptionHandler{
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleError(CustomException c, WebRequest req){
		
		
		return new ResponseEntity<>(c.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR) ;
		
	}

}

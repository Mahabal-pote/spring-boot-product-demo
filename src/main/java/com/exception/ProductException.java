package com.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

//@ControllerAdvice
public class ProductException {
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	//@ExceptionHandler(Exception.class)
	/*
	 * public Map<String, String> handleValidationExceptions(Exception ex) {
	 * Map<String, String> errors = new HashMap<>(); errors.put("error",
	 * "Please enter valid data");
	 */
//	    ex.getMessage().getAllErrors().forEach((error) -> {
//	        String fieldName = ((FieldError) error).getField();
//	        String errorMessage = error.getDefaultMessage();
//	    });
	/*
	 * return errors; }
	 */
	public ResponseEntity handleNotFoundException(Exception exception, WebRequest request) {
		return new ResponseEntity("Request not valid", HttpStatus.BAD_REQUEST);
}

/*
 * @ControllerAdvice public class RestResponseEntityExceptionHandler extends
 * ResponseEntityExceptionHandler {
 * 
 * @ExceptionHandler({ ResourceNotFoundException.class }) public
 * ResponseEntity<Object> handleNotFoundException(Exception exception,
 * WebRequest request) { return new ResponseEntity<Object>("Resource Not Found",
 * new HttpHeaders(), HttpStatus.NOT_FOUND); }
 */
}

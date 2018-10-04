package com.nelioalves.cursomc.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nelioalves.cursomc.resources.StandardError;
import com.nelioalves.cursomc.services.exception.ObjectNotFoundException;

@ControllerAdvice //Classe auxiliar que interceptar as Exceçoes 
public class ResourceExceptionHandler {
	
	
	@ExceptionHandler(ObjectNotFoundException.class)// indica que é um tratador de execeçao do tipo da classe
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	

}

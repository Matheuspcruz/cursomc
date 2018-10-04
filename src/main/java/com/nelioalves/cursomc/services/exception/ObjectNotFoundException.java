package com.nelioalves.cursomc.services.exception;

public class ObjectNotFoundException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) { //construtor
		super(msg);
		
		
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) { //Construtor que recebe uma msg e uma outra exeçao que é a causa
			
		super(msg, cause);
	}
}

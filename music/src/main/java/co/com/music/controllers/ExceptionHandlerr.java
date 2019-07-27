package co.com.music.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import co.com.music.exception.musicException;
import co.com.music.model.ResponseError;
@ControllerAdvice
public class ExceptionHandlerr {
	@ExceptionHandler(musicException.class)
	public ResponseEntity<ResponseError> domainExceptionHandler(musicException ex) {
	ResponseError response = new ResponseError(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
	return new ResponseEntity<ResponseError>(response, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ResponseError> generalException(Throwable ex) {
	ResponseError response = new ResponseError(HttpStatus.INTERNAL_SERVER_ERROR.value(),
	"Ha ocurrido un error en el servidor, por favor verificar con el administrador");
	return new ResponseEntity<ResponseError>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
